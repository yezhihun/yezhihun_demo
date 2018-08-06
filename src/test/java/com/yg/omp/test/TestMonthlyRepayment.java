package com.yg.omp.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yg.omp.base.PageModel;
import com.yg.omp.entity.MonthlyRepayment;
import com.yg.omp.job.MonthlyRepaymentJob;
import com.yg.omp.job.TriggerListenerForBackup;
import com.yg.omp.utils.enums.DeductStatus;
import com.yg.omp.webservice.CallOmWebService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-application.xml"})
public class TestMonthlyRepayment {

	@Autowired
	private CallOmWebService callOmWebService;

	@Autowired
	private MonthlyRepaymentService monthlyRepaymentService;

	@Autowired
	private MonthlyRepaymentJob monthlyRepaymentJob;
	
	@Autowired
	private TriggerListenerForBackup triggerListenerForBackup;
	
	
	@Test
//	@Transactional//标明此方法需使用事务
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void testBeginMonthlyRepayment(){
		try{
			callOmWebService.synMonthlyRepaymentData("2016-10-30");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
//	@Transactional//标明此方法需使用事务
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void testRepaymentJob(){
		try{
			monthlyRepaymentJob.executeInternal(null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Transactional//标明此方法需使用事务
	@Rollback//标明使用完此方法后事务不回滚,true时为回滚
	public void batchInsertOrUpdateTest(){
		// 测试修改批量查询的方法
		monthlyRepaymentService.batchInsertOrUpdate(createTestData());
	}

	public List<MonthlyRepayment> createTestData(){
		List<MonthlyRepayment> list = new ArrayList<>();
		MonthlyRepayment bean1 = new MonthlyRepayment();
		bean1.setReId("1144554");
		list.add(bean1);
		MonthlyRepayment bean2 = new MonthlyRepayment();
		bean2.setReId("1144038");
		list.add(bean2);
		MonthlyRepayment bean3 = new MonthlyRepayment();
		bean3.setReId("1143912");
		list.add(bean3);
		return list;
	}

//	@Test
//	@Transactional//标明此方法需使用事务
//	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
//	public void testEndMonthlyRepayment(){
//		try{
//			List<MonthlyRepaymentResponse> list = new ArrayList<MonthlyRepaymentResponse>();
//			MonthlyRepaymentResponse res = new MonthlyRepaymentResponse();
//			res.setDeductionAmount(new BigDecimal(11.1).setScale(2,RoundingMode.HALF_UP));
//			res.setOrderNum("11111");
//			res.setPayTime(new Date());
//			res.setReId(111+"");
//			res.setStatus(1);
//			list.add(res);
//			callOmWebService.endMonthlyRepayment(list);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}

	@Test
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void testDoRepayment(){
		try{
			callOmWebService.doRepayment("2016-10-30");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void testPage(){
		MonthlyRepayment repayment = new MonthlyRepayment();
		repayment.setDeductStatus(DeductStatus.WCL.getVal());
		PageModel page = new PageModel();
		page = monthlyRepaymentService.findListByPage(repayment, page);
	}

	@Test
	@Transactional//标明此方法需使用事务
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void test(){
//		monthlyRepaymentService.doTest();
		try{
			Class<?> demo = MonthlyRepaymentService.class;
			Method method = demo.getMethod("doTest");
			method.invoke(monthlyRepaymentService);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	@Transactional//标明此方法需使用事务
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void testTriggerListener(){
//		monthlyRepaymentService.doTest();
		try{
			triggerListenerForBackup.triggerComplete(null, null, null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
