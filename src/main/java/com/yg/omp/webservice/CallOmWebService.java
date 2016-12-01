package com.yg.omp.webservice;


public interface CallOmWebService {

	/**
	 * 
	* @Author tianye
	* @Description: 由定时任务 ，同步月还数据，向C# 请求月还数据 
	* @return String
	* @throws
	 */
	public void synMonthlyRepaymentData(String date);
	
	/**
	 * 
	* @Author tianye
	* @Description: 月还结束，同步代扣状态至C# 
	* @return String
	* @throws
	 */
//	public void endMonthlyRepayment(List<MonthlyRepaymentResponse> list);
	
	/**
	 * 
	* @Author tianye
	* @Description: 发起月还流程
	* @return void
	* @throws
	 */
	public void doRepayment(String date);
}

