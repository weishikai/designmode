package com.dewei.designmode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 发送工厂
 * @author sa
 *
 */
public class SendFactory {
	private Logger logger = LoggerFactory.getLogger(SendFactory.class);
	public Sender produce(String s) {
		if(s.equals("mail")) {
			return new MailSend();
		} else if(s.equals("sms")) {
			return new SmsSend();
		}
		return null;
	}
	// 设计模式-工厂模式
	// 工厂模式
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("sms");
		sender.send();
	}
}
