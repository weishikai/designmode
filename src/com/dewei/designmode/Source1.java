package com.dewei.designmode;

public class Source1 implements Sourceable1 {

	@Override
	public void request() {
		System.out.println("这是source1里面request");
	}

}
