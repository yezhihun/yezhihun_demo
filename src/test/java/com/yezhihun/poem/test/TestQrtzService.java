package com.yezhihun.poem.test;
//package com.yezhihun.poem.test;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.transaction.Transactional;
//
//import org.apache.commons.httpclient.util.DateUtil;
//import org.apache.commons.lang.time.DateUtils;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.yezhihun.poem.dao.QrtzTriggerDao;
//import com.yezhihun.poem.service.QrtzTriggerService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring/spring-application.xml"})
//public class TestQrtzService {
//
//	@Autowired
//	private QrtzTriggerService qrtzTriggerService;
//	@Autowired
//	private QrtzTriggerDao qrtzTriggerDao;
//	
//	@Test
//	@Transactional//标明此方法需使用事务
//	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
//	public void test(){
//		try{
//			String jobName = "normalRepaymentTrigger";
////			qrtzTriggerService.startJob(jobName);
//			qrtzTriggerService.resetCronByTirggerName("* * * * * ?", "normalRepaymentTrigger");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	@Transactional//标明此方法需使用事务
//	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
//	public void testAdd(){
//		try{
////			qrtzTriggerService.resetCronByTirggerName("* * * * * ?", "normalRepaymentTrigger");
////			qrtzTriggerService.createSimpleJob("ceshi", "* * 10 10 10 ? 2017");
//			qrtzTriggerService.discardJob("1476783317818-job");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		try{
//			String dateStr = "2016-10-30";
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
//			Date date = sdf.parse(dateStr);
//			dateStr += " 2,13:0:0";
//			System.out.println(createCronByDate(dateStr));
//			for(int i=1;i<=2;i++){
//				Date newDate = DateUtils.addDays(date, i);
//				String str = sdf.format(newDate);
//				str += " 12:0:0";
//				System.out.println(createCronByDate(str));
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	private static String createCronByDate(String dateStr){
//		dateStr = dateStr.replace("-", " ").replace(":", " ").trim();
//		String[] s = dateStr.split(" ");
//		StringBuffer sb = new StringBuffer();
//		for(int i=s.length-1;i>=0;i--){
//			sb.append(s[i]+" ");
//			if(i==1){
//				sb.append("? ");	
//			}
//		}
//		return sb.toString().trim();
//	}
//}
