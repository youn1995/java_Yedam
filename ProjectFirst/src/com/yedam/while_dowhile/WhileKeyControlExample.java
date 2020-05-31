package com.yedam.while_dowhile;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------");
				System.out.println("1.speed up 2.speed down 3.stop");
				System.out.println("--------------------");
				System.out.print("select > ");
			}
			
			keyCode = System.in.read();
			if(keyCode == 49) {
				speed++;
				System.out.println("speed is "+speed);
			}else if(keyCode == 50) {
				speed--;
				System.out.println("speed is "+speed);
			}else if(keyCode == 51) {
				run = false;
			}
		}
		System.out.println("prog end");
	}
}