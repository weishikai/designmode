package com.dewei.designmode;
/**
 * 持有类的单例模式
 * @author sa
 *
 */
public class Singleton3 {
	// 用这个类来维护单例创建 解决赋值和初始化同时完成(内部的类)
	private static final class InstanceHolder {
		private static Singleton3 instance = new Singleton3();
	}
	
	public static Singleton3 getInstance() {
		return InstanceHolder.instance;
	}
}
