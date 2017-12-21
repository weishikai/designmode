package com.dewei.designmode;
/**
 * 桥接模式
 * @author sa
 *
 */
public class Bridge {
	// 拿到实例
	SourceSub sourceSub;
	// 得到实例
	public SourceSub getSourceSub() {
		return sourceSub;
	}
	// 设置主函数需要初始化的对象
	public void setSourceSub(SourceSub sourceSub) {
		this.sourceSub = sourceSub;
	}
	// 调用具体子类的method方法
	public void method() {
		sourceSub.method();
	}
	
	
	
}
