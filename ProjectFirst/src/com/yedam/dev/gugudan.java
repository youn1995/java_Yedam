package com.yedam.dev;

public class gugudan {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				for (int k = 2; k <= 9; k++) {
					System.out.print("[" + k + "단]  ");
				}
				System.out.println();
			}
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + i * j + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					System.out.print("[" + j + "단]  ");
				} else {
					System.out.print(j + "X" + i + "=" + i * j + " ");
				}
			}
			System.out.println();
		}
	}
}
