package com.dewei.designmode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 建造者模式
 * @author sa
 *
 */
public class Build {
	// 声明实例化一个ArrayList数组
	public static ArrayList<Vehicle> lists = new ArrayList<>();
	// 构建bike
	public void buildBike(int d) {
		for (int i = 0; i < d; i++) {
			lists.add(new Bike());
		}
	}
	// 构建car
	public void buildCar(int d) {
		lists.clear();
		for (int i = 0; i < d; i++) {
			lists.add(new Car());
		}
	}
	
	public static void main(String[] args) {
		Build build = new Build();
		build.buildCar(3);
		build.buildBike(4);
		for (Vehicle x: lists) {
			x.go();
		}
	}
}
