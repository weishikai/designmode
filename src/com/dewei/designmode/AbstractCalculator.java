package com.dewei.designmode;
/**
 * 策略模式
 * @author sa
 *
 */
public abstract class AbstractCalculator {
	public int[] split(String input,String opt) {
		String[] s = input.split(opt);
		int[] n = new int[2];
		n[0] = Integer.parseInt(s[0]);
		n[1] = Integer.parseInt(s[1]);
		return n;
	}
}
