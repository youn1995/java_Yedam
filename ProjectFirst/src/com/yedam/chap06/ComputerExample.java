package com.yedam.chap06;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] values1 = {1,2,3};
		int result = com.sum1(values1);
		System.out.println(result);
		
		result = com.sum2(values1);
		System.out.println(result);
	}
}
