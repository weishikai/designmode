package com.dewei.designmode;
/**
 * 原型模式
 * @author sa
 *
 */
public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		// super.clone()调用的是Object的clone()方法
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
}
