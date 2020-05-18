package com.yedam.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int[] ary = { 10, 8, 5, 3, 7, 1, 2, 9};

		int i = 0;
		int sum = 0;
		while (true) {
			if (ary[i] > ary[i + 1]) {
				int temp = ary[i];
				ary[i] = ary[i + 1];
				ary[i + 1] = temp;
			}
			i++;
			if(i == ary.length-1) {
				i = 0;
				sum ++;
			}
			if(sum == ary.length-1) {
				break;
			}
		}

//		for (int i = 0; i < ary.length; i++) {
//			for(int j = 0; j<ary.length; j++) {
//				if(ary[i] < ary[j]) {
//					int temp = ary[i];
//					ary[i] = ary[j];
//					ary[j] = temp;
//					
//				}
//			}
//
//		}
//
		for (int j = 0; j < ary.length; j++)
			System.out.println(ary[j]);
	}

}
