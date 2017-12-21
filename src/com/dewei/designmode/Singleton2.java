package com.dewei.designmode;
/**
 * 恶汉模式
 * @author sa
 *
 */
public class Singleton2 {
	// 延迟加载
	private static Singleton2 singleton = null;
	// 静态方法初始化实例
	public static Singleton2 getInstance() {
		if(singleton == null) {
			// 加上线程锁
			synchronized (singleton) {
				if(singleton == null) {
					singleton = new Singleton2();
				}
			}
		}
		return singleton;
	}
	// 为了系列化传输使用,序列化保持一致
	public Object readResolve() {
		return singleton;
	}
}
