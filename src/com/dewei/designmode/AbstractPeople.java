package com.dewei.designmode;

/**
 * 模板模式
 * @author sa
 *
 */
public abstract class AbstractPeople {
	public void prepareToSchool() {
		dressUp();
		eat();
		takeSomething();
	}

	public abstract void dressUp();
	public abstract void eat();
	public abstract void takeSomething();
}