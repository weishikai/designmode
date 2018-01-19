package com.dewei.designmode;

public class Student extends AbstractPeople {

	@Override
	public void dressUp() {
		System.out.println("学生穿校服");
	}

	@Override
	public void eat() {
		System.out.println("学生吃家长做好的饭");
	}

	@Override
	public void takeSomething() {
		System.out.println("学生背书包带上作业本");
	}

}
