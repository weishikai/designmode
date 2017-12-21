package com.dewei.designmode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 原型模式
 * @author sa
 * @Date 2017/12/21
 */
public class Prototype1 implements Cloneable, Serializable {
	private final long SerializableUid = 1L;

	// 浅度clone
	public Object clone() throws CloneNotSupportedException {
		Prototype1 prototype1 = (Prototype1) super.clone();
		return prototype1;
	}

	// 深度clone  
	public Object deepClone() throws IOException, ClassNotFoundException {
		// 采用流的形式读入当前对象的二进制输入,再写出二进制数据对应的对象 
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		// new一个对象输出流,把转化为字节数组输出流,把本身对象传递给他
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(objectOutputStream);
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
		return objectInputStream.readObject();
	}
}
