package com.yedam.api.math;


public class MathExample {
	public static void main(String[] args) {

		//절댓값 계산
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1: "+v1);
		System.out.println("v2: "+v2);
		
		//올림
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3: "+ v3);
		System.out.println("v4: "+ v4);
		
		//버림
		double v5 = Math.floor(5.9);
		double v6 = Math.floor(-5.7);
		System.out.println("v5: "+ v5);
		System.out.println("v6: "+ v6);
		
		//최댓값
		int v7 = Math.max(5, 7);
		double v8 = Math.max(5.3, 3.2);
		System.out.println("v7: "+v7);
		System.out.println("v8: "+v8);
		
		//최솟값 Math.min
		
		double v11 = Math.random();
		System.out.println(v11);
	
		double v12 = Math.rint(5.4);
		double v13 = Math.rint(5.7);
		System.out.println("v12: "+v12);
		System.out.println("v13: "+v13);
		
		double value = 12.34567;
		double temp1 = value * 10000;
		double temp2 = Math.round(temp1);
		double v14 = temp2/10000.0;
		System.out.println("v14: " +v14);
	}
}
