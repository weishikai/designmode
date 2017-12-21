package com.dewei.designmode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 短信发送(工厂模式)
 * @author sa
 *
 */
public class SmsSend implements Sender {
	private Logger logger = LoggerFactory.getLogger(SmsSend.class);
	@Override
	public void send() {
		logger.info("-------->短信发送");
//		System.out.println("短信发送");
	}

}
