package com.dewei.designmode;
/**
 * 装饰者模式 
 * 需要扩展一个类的功能
 * 动态的为一个对象增加功能,而且还能对象撤销 产生过多相似的对象,不易拍错
 * @author sa
 *
 */
public class Decorator implements Sourceable {
	Source source;
	
	public Decorator(Source s) {
		this.source = s;
	}
	@Override
	public void method() {
		System.out.println("Decorator的method");
		source.method1();
	}
	
	public static void main(String[] args) {
		// 装饰者模式
		Sourceable sourceable = new Decorator(new Source());
		sourceable.method();
	}
}
