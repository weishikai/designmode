package com.dewei.designmode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.chrono.JapaneseChronology;

import javax.security.auth.callback.LanguageCallback;
// 实现java.lang.reflect包里面的InvocationHandler
/**
 * 代理模式使用
 * @author sa
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}
	// 回调方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始动态代理");
		Object result = method.invoke(target, args);
		System.out.println("结束动态代理");
		return result;
	}
	
	// 生成动态代理
	public Object getProxy() {
		// getContentClassLoader方法得到JVM类加载器
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		// 再用数组得到构造方法
		Class<?>[] interfaces = target.getClass().getInterfaces();
		// 返回将要传递类的实例
		return java.lang.reflect.Proxy.newProxyInstance(loader,interfaces,this);
	}
}
