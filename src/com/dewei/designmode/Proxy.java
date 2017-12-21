package com.dewei.designmode;

public class Proxy implements Sourceable1 {
	Source1 source1;
	
	public Proxy(String s) {
		if(s.equals("ok"))
		source1 = new Source1();
	}
	
	@Override
	public void request() {
		System.out.println("开始代理");
		source1.request();
		System.out.println("结束代理");
	}
	
	public static void main(String[] args) {
		// 代理模式--静态代理
		Sourceable1 sourceable1 = new Proxy("ok");
		sourceable1.request();
		
		// 代理模式-动态代理
		// 执行代理对象的方法,其实就是执行InvocationHandle对象的invoke方法,传入的参数分别是当前代理对象,当前执行的方法和参数
		Service service = new Service1(); 
		MyInvocationHandler handler = new MyInvocationHandler(service);
		Service serviceProxy = (Service) handler.getProxy();
		serviceProxy.test();
	}
}
