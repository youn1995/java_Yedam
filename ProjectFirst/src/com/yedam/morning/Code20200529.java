package com.yedam.morning;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Code20200529 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[3];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(9) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				boolean loopingNumber = true;
				if (arr[i] == arr[j]) {
					while (loopingNumber) {
						arr[j] = random.nextInt(9) + 1;
						if (arr[i] != arr[j]) {
							loopingNumber = false;
						}
					}
				}
			}
		}
		int count =0;
		System.out.println("야구게임 숫자 생성 완료!");
		System.out.println("10번안에 숫자를 맞추세요!");
		int[] userArr = new int[3];
		while (true) {
			System.out.println();
			System.out.println((count+1) + "번째 시도");
			while (true) {
				boolean userCheckedNum = true;
				System.out.print("숫자를 입력하세요 > ");
				String userInput = scn.nextLine();
				if (Pattern.matches("[1-9]{3}", userInput)) {
					for (int i = 0; i < userInput.length(); i++) {
						userArr[i] = ((int) userInput.charAt(i)) - 48;
					}
					for (int i = 0; i < userArr.length; i++) {
						boolean checkSameNum = false;
						for (int j = 0; j < i; j++) {
							checkSameNum = (userArr[i] == userArr[j]);
							if (checkSameNum) {
								System.out.println("숫자는 중복될 수 없습니다");
							}
						}
						if (checkSameNum) {
							userCheckedNum = false;
							break;
						}
					}
				} else {
					System.out.println("정확한 범위의 숫자를 입력하세요");
					userCheckedNum = false;
				}
				if(userCheckedNum) {
					break;
				}
			}
			System.out.println();
			int strikeCheck = 0;
			int ballCheck = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == userArr[i]) {
					strikeCheck++;
				}
				for (int j = 0; j < i; j++) {
					if (arr[i] == userArr[j] && i != j) {
						ballCheck++;
					}
				}
			}	
			if (strikeCheck != 0 && strikeCheck != 3) {
				System.out.print(strikeCheck + " 스트라이크");
				System.out.println();
			} else if (strikeCheck == 3) {
				System.out.print(strikeCheck + " 스트라이크!");
				System.out.println(" 정답!");
				break;
			}
			if (ballCheck != 0) {
				System.out.print(ballCheck + " 볼");
				System.out.println();
			}
			if(strikeCheck == 0 && ballCheck ==0) {
				System.out.println("하나도 못 맞췄네요 ㅋㅋ");
				System.out.println();
			}
			count++;
			if(count == 10) {
				System.out.println("10번안에 못 맞췄네요ㅋㅋ");
				break;
			}
		}
	} // end of main
}