package com.yedam.dev;

public class ArrayExample {

	public static void main(String[] args) {

		int[] intAry = new int[5];
		intAry[0] = 10;
		intAry[1] = 15;
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;

		//int[] intAry2 = { 1, 2, 3, 4, 5 };

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += intAry[i];
			System.out.println(intAry[i]);
		}
		System.out.println(sum);

		// 문제 5 10 15 ... 50짜리

		int[] intAry3 = new int[10];
		for (int i = 0; i < 10; i++) {
			intAry3[i] = (i + 1) * 5;
		}
		
		for(int i=0; i<intAry3.length; i++) {
			System.out.println(intAry3[i]);
		}

	} // end of main

}
