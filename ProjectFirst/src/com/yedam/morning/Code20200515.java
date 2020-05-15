package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(sum++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		int row = 1;
		for (int i = 1; i <= 5; i++) {
			int inloopnum = row;
			for (int j = 1; j <= 5; j++) {
				System.out.print(inloopnum + " ");
				inloopnum = inloopnum + 5;
			}
			row++;
			System.out.println();
		}
		
		System.out.println("------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+j*5 + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		

		int num = 1;
		int[][] arr1 = new int[5][5];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[j][i] + " ");
			}
			System.out.println();
		}

	}
}
