package com.dewei.designmode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 邮件发送(工厂模式)
 * @author sa
 *
 */
public class MailSend implements Sender {
	private Logger logger = LoggerFactory.getLogger(MailSend.class);
	@Override
	public void send() {
		logger.info("-------->邮件发送");
//		System.out.println("邮件发送");
	}

}
