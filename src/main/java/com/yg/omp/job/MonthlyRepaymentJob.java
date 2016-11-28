package com.yg.omp.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.yg.omp.utils.DateUtil;
import com.yg.omp.webservice.CallOmWebService;

/**
 * 
 * 
 *
 * Description: 月还任务
 *
 * @author tianye
 * @version V1.0
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2016年9月7日上午10:27:30    tianye       V1.0        
 * </pre>
 */

@Component
public class MonthlyRepaymentJob extends QuartzJobBean{
	

	@Autowired
	private CallOmWebService callOmWebService;
//	@Value("${test.date}")
//	private String testDate;

	/**
	 * 
	* @Author tianye
	* @Description: 执行任务
	* @return void
	* @throws
	 */
//	@Override
	public void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		String date = DateUtil.getRepayDate();
//		String date = testDate;
		callOmWebService.synMonthlyRepaymentData(date);
		callOmWebService.doRepayment(date);
	}
	
	
}
