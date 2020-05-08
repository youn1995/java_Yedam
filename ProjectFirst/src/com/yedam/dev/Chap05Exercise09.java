package com.yedam.dev;

import java.util.Scanner;

public class Chap05Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scn.nextInt(); scn.nextLine();

			if (selectNo == 1) {
				System.out.print("학생 수 >");
				studentNum = scn.nextInt(); scn.nextLine();

			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: ");
					scores[i] = scn.nextInt(); scn.nextLine();
				}

			} else if (selectNo == 3) {
				int indexScore = 0;
				for (int score : scores) {
					System.out.println("scores[" + indexScore++ + "]: " + score);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int maxvalue = Integer.MIN_VALUE;
				for (int score : scores) {
					sum += score;
					if (score > maxvalue) {
						maxvalue = score;
					}
				}
				System.out.println("합계: "+sum);
				System.out.println("최고 점수: " + maxvalue);
				System.out.println("평균 점수: " + ((double) sum / studentNum));

			} else if (selectNo == 5) {
				run = false;
			}

		} // end of while
		System.out.println("Program End");
	}// end of main
}// end of class
