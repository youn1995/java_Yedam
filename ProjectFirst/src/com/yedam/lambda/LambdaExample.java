package com.yedam.lambda;

//class MyFuncClass implements MyFunctionalInterface{
//
//	@Override
//	public void run() {
//		System.out.println("RUN"); //인터페이스구현 클래스
//	}
//	
//}
public class LambdaExample {
	public static void main(String[] args) {
//		MyFunctionalInterface fi = new MyFuncClass();

//		MyFunctionalInterface fi = new MyFunctionalInterface() {//익명구현객체
//			@Override
//			public void run() {
//				System.out.println("RUN");
//			}
//		};

		// 간단한 람다표현식 ->run() 메소드 구현하는부분
		// MyFunctionalInterface fi = () -> {System.out.println("RUN");};
		MyFunctionalInterface fi = () -> System.out.println("RUN");
		fi.run();

//		MySumInterface si = new MySumInterface() { //매개값이 있는 인터페이스 익명구현객체
//			@Override
//			public void sum(int num1, int num2) {
//				int result = num1+num2;
//				System.out.println(result);
//			}
//		};

		// 매개값이 있는 인터페이스 람다표현식
//		MySumInterface si = (x, y) -> {System.out.println("result: " + (x+y));}; 
		MySumInterface si = (x, y) -> System.out.println("result: " + (x + y)); // 실행구문이 하나만 있으면 {}생략가능
		si.sum(3, 4);

		// 반환값이 있는 인터페이스
		// 익명구현객체
//		MyMultiInterface mi = new MyMultiInterface() {
//			
//			@Override
//			public int multi(int num1, int num2) {
//				return num1*num2;
//			}
//		};
		MyMultiInterface mi = (num1, num2) -> {
			return num1 * num2;
		};
		int result = mi.multi(19, 33);
		System.out.println("result: " + result);
	}
}
