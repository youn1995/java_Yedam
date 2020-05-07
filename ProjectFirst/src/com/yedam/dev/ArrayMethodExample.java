package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		double[] dobAry = { 1.1, 2.2, 3.3, 4.4 };
		double result1 = avgAry(dobAry);
		System.out.println(result1);

		int result = sumAry(intAry);
		System.out.println("배열 intAry 합: " + result);
	}// end of main

	public static double avgAry(double[] ary) {
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < ary.length; i++) {
			// avg += ary[i] / ary.length;
			sum = sum + ary[i];
			System.out.println(sum);
		}
		avg = sum / ary.length;
		return avg;
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}// end of sumAry

}// end of class
