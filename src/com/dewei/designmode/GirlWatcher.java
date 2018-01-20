package com.dewei.designmode;

public class GirlWatcher implements Watcher {

	@Override
	public void update(String msg) {
		System.out.println("女生群体关注" + msg);
	}
	

}
