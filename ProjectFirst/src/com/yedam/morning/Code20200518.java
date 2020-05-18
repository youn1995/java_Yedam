package com.yedam.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int[] ary = { 10, 8, 5, 3, 7, 1 };
		int i = 0;
		
		while(i<ary.length) {
			int changeNum = 0;
			if(ary[i] > ary[i+1]) {
				int num1 = ary[i];
				int num2 = ary[i+1];
				ary[i] = num1;
				ary[i+1] = num2;
				changeNum++;
			}
			
			if(changeNum == 0) {
				break;
			}
			i++;
			
		}
	}
}
