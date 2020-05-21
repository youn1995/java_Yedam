package com.yedam.interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputExceptionCheck {
	Scanner scn = new Scanner(System.in);

	public int intTypeNumCHeck() {
		int checkedNum = 0;

		while (true) {
			try {
				checkedNum = scn.nextInt();
				break;

			} catch (InputMismatchException e) {
				System.out.println("올바르지 않은 값을 입력했습니다.");
				System.out.print("정수만 입력하세요 >");
				scn.nextLine();
			}

		}
		scn.nextLine();
		return checkedNum;
	}
	
	
	public String StringTypeCHeck()  {
		String checkedString = null;
		
		while (true) {
			checkedString = scn.nextLine();
			if(Pattern.matches(".*[^a-zA-Z].*", checkedString)) {
				System.out.println("문자만 입력하세요");

			} else {
				break;
			}
		}
		return checkedString;
	}
	
	public String DateTypeCheck() {
		String checkedDate = null;
		while (true) {
			checkedDate = scn.nextLine();
			if(Pattern.matches("", checkedDate)) {
				
			} else {
				break;
			}
			
		}
		
		return checkedDate;
	}
}
