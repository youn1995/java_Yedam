package com.yedam.dev;

public class ArrayEx {

	public static void main(String[] args) {

		//int num1 = 100;
		//String str1 = "Hello";

		int[] intAry = new int[5];
		intAry[0] = 10;
		intAry[1] = 20;
		System.out.println(intAry[1]);

		String[] strAry = { "Hello", "world", "Nice", "10" };
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}

		// enhanced for
		for (String str : strAry) {
			System.out.println(str);
		}

		int result = sumAry(intAry);
		System.out.println(result);
		
		double[] doubAry = new double[] {1.1,2.2,3.3};
		double result1 = avgAry(doubAry);
		System.out.println(result1);
	}// end of main

	public static double avgAry(double[] ary) {
		double sum = 0.0, avg = 0.0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		avg = sum/ary.length;
		return avg;
	}
	
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}

}// end of class
