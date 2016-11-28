package com.yg.omp.mq;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yg.omp.mq.model.PaymentTransferInfoResponse;
import com.yg.omp.service.MonthlyRepaymentService;
import com.yg.omp.utils.JaxbUtil;

@Component("successMessageReceiverForPayCenter")
public class SuccessMessageReceiverForPayCenter implements MessageListener{

	private static Logger log = Logger.getLogger(SuccessMessageReceiverForPayCenter.class);
	
	@Autowired
	private MonthlyRepaymentService monthlyRepaymentService;
	
	private List<PaymentTransferInfoResponse> convertMessage(byte[] byteRecord){
		try{
			List<PaymentTransferInfoResponse> list = JaxbUtil.converyToJavaBean("paymentTransferInfoResponse", new String(byteRecord), PaymentTransferInfoResponse.class);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void onMessage(Message message) {
		byte[] byteRecord = message.getBody();
		try{
			log.info("receive success :"+new String(byteRecord));
			//将消息转换为PaymentTransferInfoResponse
			final List<PaymentTransferInfoResponse> list = convertMessage(byteRecord);
			if(list != null){
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						monthlyRepaymentService.doCallBackForRepayment(list);
					}
				}).start();
			}
		}catch(Exception e){
			log.error(e);
			e.printStackTrace();
		}
	}
}
