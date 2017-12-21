package com.dewei.designmode;
/**
 * 类适配器模式
 * 把Source里面的method1整合到Targetable里面去,让Targetable实例化对象调用source
 * @author sa
 *
 */
public class Adapter1 extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("这是Adapter1里面的method2方法");
	}
	
	public static void main(String[] args) {
		// 类适配模式
		Targetable target = new Adapter1();
		target.method1();
		target.method2();
	}
}
