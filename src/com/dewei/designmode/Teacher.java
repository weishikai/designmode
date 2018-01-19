package com.dewei.designmode;

public class Teacher extends AbstractPeople {

	@Override
	public void dressUp() {
		System.out.println("老师穿西装");
	}

	@Override
	public void eat() {
		System.out.println("老师做饭吃");
	}

	@Override
	public void takeSomething() {
		System.out.println("老师带上电脑核讲课ppt");
	}

}
