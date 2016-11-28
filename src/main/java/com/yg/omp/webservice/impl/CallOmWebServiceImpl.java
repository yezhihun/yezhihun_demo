package com.yg.omp.webservice.impl;

import com.yg.omp.entity.MonthlyRepayment;
import com.yg.omp.entity.MonthlyRepaymentResponse;
import com.yg.omp.entity.OmLog;
import com.yg.omp.service.MonthlyRepaymentService;
import com.yg.omp.service.OmLogService;
import com.yg.omp.service.impl.MonthlyRepaymentServiceImpl;
import com.yg.omp.utils.DateUtil;
import com.yg.omp.utils.HttpUtil;
import com.yg.omp.utils.JaxbUtil;
import com.yg.omp.utils.UUIDUtil;
import com.yg.omp.utils.enums.Constant;
import com.yg.omp.utils.enums.DeductStatus;
import com.yg.omp.webservice.CallOmWebService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CallOmWebServiceImpl implements CallOmWebService{

	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private MonthlyRepaymentService monthlyRepaymentService;
	
	@Autowired
	private OmLogService omLogService;
	
	@Value("${om.allData.url}")
	private String omAllDataUrl;
	
	@Value("${om.repayData.url}")
	private String omRepayData;
	
	@Value("${om.pushData.url}")
	private String omPushData;

	/**
	 * 同步月还数据
	 * @param date 日期
	 */
	@Override
	public void synMonthlyRepaymentData(String date) {
		String xmlData = "";
		System.out.println("syn data begin--------------" + DateUtil.getCurrentDatetimeSecond());
		log.info("syn data begin--------------" + DateUtil.getCurrentDatetimeSecond());
		try {
			/**
			 * 		1,请求C#，发起月还,同步月还数据
			 */
			xmlData = HttpUtil.sendGet(omAllDataUrl+"/"+date, "");
			System.out.println("syn data end------------" + DateUtil.getCurrentDatetimeSecond());
			log.info("syn data end------------" + DateUtil.getCurrentDatetimeSecond());
		} catch (Exception e) {
			log.error("接口同步数据失败");
			e.printStackTrace();
		}
		
		OmLog omLog = new OmLog();
		boolean flag = true;
		try{
			List<MonthlyRepayment> list = convertData(xmlData);
			System.out.println("convert data --------------"+DateUtil.getCurrentDatetimeSecond());
			log.info("convert data --------------"+DateUtil.getCurrentDatetimeSecond());
			for(MonthlyRepayment repayment : list){
				//储存至数据库
				repayment.setCreateTime(DateUtil.getDate());
//				repayment.setGlobalId(Constant.GLOBAL_ID);
				repayment.setApplicationId(Constant.GLOBAL_ID);
				repayment.setGlobalId(UUIDUtil.getUUID32()); // 获取唯一标识
//				String correlationId = (new Date()).getTime() +"-"+(int)(Math.random()*10000);
//				repayment.setCorrelationId(correlationId);
				repayment.setDeductStatus(DeductStatus.WCL.getVal());
				
			}
			monthlyRepaymentService.batchInsertOrUpdate(list); // 批量保存数据
			System.out.println(" MonthlyRepayment insert data count is " + list.size() + " -----------"+DateUtil.getCurrentDatetimeSecond());
			log.info(" MonthlyRepayment insert data count is " + list.size() + " -----------"+DateUtil.getCurrentDatetimeSecond());
		}catch(Exception e){
			System.out.println("exception------------" + DateUtil.getCurrentDatetimeSecond());
			log.error(e);
			e.printStackTrace();
			flag = false;
		}finally{
			omLog.setData(xmlData);
			omLog.setInterfaceDesc("同步还款数据接口");
			omLog.setOperTime(new Date());
			omLog.setOperStatus(flag?1:0);
			
//			omLogService.insert(omLog);
		}
	}
	
	/**
	 * 
	* @Author tianye
	* @Description: 
	* @return List<MonthlyRepayment>
	* @throws
	 */
	private List<MonthlyRepayment> convertData(String xmlData){
		List<MonthlyRepayment> list = JaxbUtil.converyToJavaBean("ArrayOfRepayData", xmlData, MonthlyRepayment.class);
		return list;
	}

	@Override
	public void endMonthlyRepayment(List<MonthlyRepaymentResponse> list) {
		/**
		 *  1,同步月还结果
		 */
		String xmlStr = JaxbUtil.convertToXml(list, "ArrayOfPushData", MonthlyRepaymentResponse.class);
		
		String listRes = "";
		for(int i=0; i<list.size(); i++){
			listRes = listRes + list.get(i).getReId() + ",";
		}
		log.info("list of reId--------------------"+listRes);
		try{
			String result = HttpUtil.sendPost(omPushData, xmlStr);
			log.info("sentPost result is "+result);
		}catch(Exception e){
			e.printStackTrace();
			log.error(e);
		}
		
	}
	
	@Override
	public void doRepayment(String date) {
		// 推送信息至mq队列
		MonthlyRepaymentServiceImpl.messageCount=0;
		// 获取月还数据
		List<MonthlyRepayment> listRepayment = monthlyRepaymentService.findForRepayment(date);
		System.out.println("doRepayment begin,size is "+listRepayment.size()+" -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("doRepayment begin,size is "+listRepayment.size()+" -------------- "+DateUtil.getCurrentDatetimeSecond());
		monthlyRepaymentService.doBatchRepayment(listRepayment);
//		for(MonthlyRepayment repayment : listRepayment){
//			monthlyRepaymentService.doRepayment(repayment);
//		}
		System.out.println("doRepayment end -------------- "+DateUtil.getCurrentDatetimeSecond());
		log.info("doRepayment end -------------- "+DateUtil.getCurrentDatetimeSecond());
	}

}
