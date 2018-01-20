package com.dewei.designmode;
/**
 * 观察者模式
 * @author sa
 *
 */
public class BoyWatcher implements Watcher {

	@Override
	public void update(String msg) {
		System.out.println("男生群体关注:" + msg);
	}

}
