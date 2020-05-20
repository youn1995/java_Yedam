package com.yedam.exceptions;

public class ArrayIndextOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] intAry = new int[3];
		
//		for(int i=0; i <= intAry.length; i++) {
//			try {
//				intAry[i] = i+1; //runtime exception
//				System.out.println(intAry[i]);
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("배열의 범위를 초과했습니다. intAry["+i+"]");
//			}
//		}
//		
//		System.out.println("End of Prog");
		
		
		for(int i=0; i <= intAry.length; i++) {
			try {
				intAry[i] = i+1; //runtime exception
				System.out.println(intAry[i]); 
				int num1 = Integer.parseInt(args[0]); //try안에 순서대로 진행하다가 예외가 발생한 부분부터 catch로 감
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다. intAry["+i+"]");
			} catch(NumberFormatException e1) { //발생할수있는 예외는 모두 catch를 해줘야함 아니면 두개를 포함할수있는 상위 exception을 사용 --순서에 맞춰 catch절을 해줘야함 
				System.out.println("변환 불가");
			} catch(Exception e2) {
				System.out.println("알수없는 오류");//Exception이 catch절 위에있으면 하위catch문들은 실행이 안됨
			}
		}
		
		System.out.println("End of Prog");
	}
}
