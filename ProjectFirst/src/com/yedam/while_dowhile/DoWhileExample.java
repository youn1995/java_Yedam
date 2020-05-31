package com.yedam.while_dowhile;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("q to end");
		
		Scanner scn = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scn.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		
		System.out.println();
		System.out.println("prog end");
	}
}
