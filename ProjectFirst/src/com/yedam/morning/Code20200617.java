package com.yedam.morning;

public class Code20200617 {
	public static void main(String[] args) {
		
		int NumSize = 10;
		int RanNumSize = 10;
		boolean[] bolArr = new boolean[RanNumSize];
		int[] arr = new int[10];

		for (int i = 0; i < NumSize; i++) {
			int randomNum = (int) (Math.random() * RanNumSize) + 1;
			if (!bolArr[randomNum - 1]) {
				arr[i] = randomNum;
				bolArr[randomNum - 1] = true;
			} else {
				i--;
			}

		}
		for (int i : arr) {
			System.out.print(i +", ");
		}

//		int[] arr = new int[5];
//		while (true) {
//			for (int i = 0; i < 5; i++) {
//				arr[i] = (int) (Math.random() * 5) + 1;
//				for (int j = 0; j < i; j++) {
//					if (arr[i] == arr[j]) {
//						arr[i] = (int) (Math.random() * 5) + 1;
//						i--;
//					}
//
//				}
//			}
//			if(arr[4] == arr[3] || arr[3] == arr[2] || arr[0] == arr[1] || arr[1] == arr[4]) {
//				break;
//			}
//
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + ", ");
//				arr[i] = 0;
//			}
//			System.out.println();
//	
//		}
	}
}
