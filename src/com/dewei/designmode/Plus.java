package com.dewei.designmode;

public class Plus extends AbstractCalculator implements Icalculator {

	@Override
	public int calculator(String input) {
		int[] n = split(input, "\\+");
		return n[0] + n[1];
	}
	
	
}
