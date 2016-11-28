package com.yg.omp.service.impl;

import com.yg.omp.base.PageModel;
import com.yg.omp.dao.MonthlyRepaymentDao;
import com.yg.omp.entity.DeductWater;
import com.yg.omp.entity.MonthlyRepayment;
import com.yg.omp.entity.MonthlyRepaymentResponse;
import com.yg.omp.mapper.MonthlyRepaymentMapper;
import com.yg.omp.mq.MessageSender;
import com.yg.omp.mq.model.PaymentTransferInfoResponse;
import com.yg.omp.service.DeductWaterService;
import com.yg.omp.service.MonthlyRepaymentService;
import com.yg.omp.utils.DateUtil;
import com.yg.omp.utils.enums.Constant;
import com.yg.omp.utils.enums.DeductStatus;
import com.yg.omp.utils.enums.PlantformType;
import com.yg.omp.webservice.CallOmWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MonthlyRepaymentServiceImpl extends AbstractBaseServiceImpl<MonthlyRepayment> implements MonthlyRepaymentService {

	@Autowired
	private MonthlyRepaymentDao monthlyRepaymentDao;
	
	@Autowired
	private MessageSender messageSender;
	
	@Autowired
	private CallOmWebService callOmWebService;
	
	@Autowired
	private DeductWaterService deductWaterService;
	
	@Autowired
	private MonthlyRepaymentMapper monthlyRepaymentMapper;
	
	public static Integer messageCount = 0;
	
	@Override
	@PostConstruct
	public void init() {
		this.baseDao = monthlyRepaymentDao;
	}

	@Override
	public void doRepayment(MonthlyRepayment repayment) {
//		messageSender.sendMessage(repayment);
		repayment.setDeductStatus(DeductStatus.CLZ.getVal());
		monthlyRepaymentDao.updateStatus(repayment);
//		monthlyRepaymentMapper.updateByPrimaryKeySelective(repayment);
	}

	@Override
	public List<MonthlyRepayment> findForRepayment(String date) {
		//查询可代扣数据
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date repayDate = sdf.parse(date);
			List<MonthlyRepayment> list = monthlyRepaymentDao.findByDeductStatusAndRepayDate(DeductStatus.WCL.getVal(), repayDate);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void doCallBackForRepayment(List<PaymentTransferInfoResponse> list) {
		//  更新状态被推送至运营平台
		List<MonthlyRepaymentResponse> listRepayment = new ArrayList<>();
		
		for(PaymentTransferInfoResponse response : list){
			//  根据ID查询数据
//			MonthlyRepayment repayment = monthlyRepaymentDao.findByCorrelationId(response.getCorrelationId());
			MonthlyRepayment repayment = monthlyRepaymentDao.findByGlobalId(response.getGlobalId());
			if(repayment == null){
				continue;
			}
			synchronized (messageCount) {
				messageCount ++;
				System.out.println("get message count is "+messageCount);
				log.info("get message count is "+messageCount);
			}

			//判断之前代扣状态
			if(repayment!=null && Constant.GLOBAL_ID.equals(repayment.getApplicationId()) && repayment.getDeductStatus().equals(DeductStatus.CLZ.getVal())){
				repayment.setDeductStatus(response.getPaymentStatus()==1?DeductStatus.CLCG.getVal():DeductStatus.CLSB.getVal());
				// 代扣时间 待定
				repayment.setDeductTime(new Date());
//				repayment.setTransType(response.getPaymentType());
				// 修改渠道
				repayment.setPayChannel(response.getPayChannel());
				//流水号
				repayment.setRequestId(response.getRequestId());
				monthlyRepaymentDao.updateStatus(repayment);
				// 插入response 数据库
				DeductWater water = new DeductWater(response);
				deductWaterService.insert(water);
				listRepayment.add(new MonthlyRepaymentResponse(repayment));
			}
		}
		if(listRepayment.size()>0){
			callOmWebService.endMonthlyRepayment(listRepayment);
		}
	}
	
	@Override
	public void insertOrUpdate(MonthlyRepayment repayment) {
		// 通过唯一标示去确定是否已有该数据
		MonthlyRepayment old = monthlyRepaymentDao.findByReId(repayment.getReId());
		if(old == null){
			monthlyRepaymentDao.save(repayment);
		}else{
			monthlyRepaymentDao.update(old, repayment);
		}
	}

	@Override
	public void batchInsertOrUpdate(List<MonthlyRepayment> list) {
		setList(list); // 为月还集合的id赋值
//		for(int i=0;i<size;i++){
//			MonthlyRepayment repayment = list.get(i);
//			MonthlyRepayment old = monthlyRepaymentDao.findByReId(repayment.getReId());
//			if(old != null){
//				repayment.setId(old.getId());
//			}
//		}
		System.out.println("select end--------------"+ DateUtil.getCurrentDatetimeSecond());
		monthlyRepaymentDao.batchSaveOrUpdate(list); // 批量保存数据
//		monthlyRepaymentDao.batchUpdate(list);
	}

	/**
	 * 设置list的对象的id值
	 * @param list
	 */
	private void setList(List<MonthlyRepayment> list){
		// 获取到所有根据reid查询出的数据
		List<MonthlyRepayment> monthlyRepaymentList = findByReIds(list); // 获取到月还数据
		if (monthlyRepaymentList != null && monthlyRepaymentList.size() > 0) { // 判断查出的数据是否可以循环
			w:for (MonthlyRepayment repayment : list) { // 需要赋值的list
				MonthlyRepayment bean; // 定义一个实体引用
				for (int i = 0; i < monthlyRepaymentList.size(); i++) {
					bean = monthlyRepaymentList.get(i); // 获取集合的当前对象
					if(bean.getReId().equals(repayment.getReId())){ // 判断两个reid是否一样
						repayment.setId(bean.getId());// 赋值
						monthlyRepaymentList.remove(i); // 删除这条已经赋值的数据,减少内循环执行次数，提高对比效率
						if (monthlyRepaymentList.size() == 0) {
							break w; // 退出外层循环
						}
						break ; // 退出当前内循环 开始下一个外循环
					}
				}
			}
		}
	}

	/**
	 * 从数据库获取月还数据
     * sql 通过in的方式 最多定值为1000 所以拆分查询数据
	 * @return
	 */
	private List<MonthlyRepayment> findByReIds(List<MonthlyRepayment> list){
        List<MonthlyRepayment> dataList = new ArrayList<>(); // 创建一个返回的月还集合
        int length = 1000; // sql in 方式的最大定值
        int size = ((list.size() - 1)/length) + 1; // 获取月还集合需要调用sql的次数
		for (int j = 0; j < size; j++) {
			StringBuffer sb = new StringBuffer();
			for (int i = j*length; i < list.size(); i++) {
				MonthlyRepayment bean = list.get(i);
				if (i >= (j + 1) * length){
					break;
				}else if(bean.getReId() != null && !"".equals(bean.getReId())){
					sb.append(bean.getReId()).append(","); // 拼接reid 用","分割
				}
			}
            List<MonthlyRepayment> newList = monthlyRepaymentDao.findByReIds(sb.toString().substring(0, sb.length()-1));
            if(newList != null && newList.size() > 0){ // 判断查询的不为null查询数据
                dataList.addAll(newList); // 添加获取的集合
            }
		}
		return dataList;
	}

    @Override
	public PageModel findListByPage(MonthlyRepayment repayment, PageModel page) {
		
		List<MonthlyRepayment> list = monthlyRepaymentDao.findListByPage(repayment, page);
		Long count = monthlyRepaymentDao.findCountByPage(repayment);
		for (MonthlyRepayment monthlyRepayment : list) {
			PlantformType plantformType = PlantformType.createByValue(monthlyRepayment.getPayChannel());
			if(plantformType != null){
				monthlyRepayment.setPayChannel(plantformType.getDesc());
			}
		}
		page.setRows(list);
		page.setTotal(count);
		
		return page;
		
	}

	@Override
	public List<MonthlyRepayment> findListForExport(MonthlyRepayment repayment) {
		List<MonthlyRepayment> list = monthlyRepaymentDao.findListForExport(repayment);
		return list;
	}

	@Override
	public void doBatchRepayment(List<MonthlyRepayment> repaymentList) {
		/**
		 * 注：每笔代扣理应为单独事务，但数据量大开始事务耗时太大，所以放在一个事务当中
		 * 先更新数据库状态再推送消息，为防止exception导致数据回滚产生二次代扣
		 * 可能导致结果为：数据为代扣状态，但是没有推送至支付平台
		 */
		int size = repaymentList.size();
		//1,更新数据状态
		System.out.println("update status begin -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("update status begin -------------- "+DateUtil.getCurrentDatetimeSecond());
		// 修改月还数据状态
		for(int i=0;i<size;i++){
			MonthlyRepayment repayment = repaymentList.get(i);
			repayment.setDeductStatus(DeductStatus.CLZ.getVal());
			monthlyRepaymentDao.updateStatus(repayment);
//			monthlyDao.updateStatus(repayment);
//			monthlyRepaymentMapper.updateByPrimaryKeySelective(repayment);
		}
//		monthlyDao.batchUpdateStatus(repaymentList);
		//2,推送至mq
		System.out.println("update status end -------------- "+DateUtil.getCurrentDatetimeSecond());
		System.out.println("send message begin -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("update status end -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("send message begin -------------- "+DateUtil.getCurrentDatetimeSecond());
		for(int i=0;i<size;i++){
			MonthlyRepayment repayment = repaymentList.get(i);
			messageSender.sendMessage(repayment);
		}
		System.out.println("send message end -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("send message end -------------- "+DateUtil.getCurrentDatetimeSecond());
	}

	@Override
	public BigDecimal totalMoneySum(MonthlyRepayment repayment) {
		BigDecimal totalMoneySum = monthlyRepaymentDao.totalMoneySum(repayment);
		return totalMoneySum;
	}
}
