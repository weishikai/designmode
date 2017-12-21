package com.dewei.designmode;
/**
 * 对象适配器模式
 * @author sa
 * @Date 12/21
 */
public class ObjAdapter implements Targetable {
	// 声明source类 拿到他的引用 这个叫持有类引用
	Source source;
	// 构造器
	public ObjAdapter(Source source) {
		this.source = source;
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("这是ObjAdapter里面method2方法");
	}
	
	public static void main(String[] args) {
		// 对象适配模式
		Targetable tar = new ObjAdapter(new Source());
		tar.method1();
		tar.method2();
	}
}
