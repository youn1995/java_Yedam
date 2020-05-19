package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Kim");
		Member m2 = new Member("Kim");
		Member m3 = new Member("Park");
		
		if(m1.equals(m2)) { //m1과 m2주소값이 다름 //equals재정의를 통해 값이 같으면 동등하다고 바꿔줄수있음
			System.out.println("동등합니다.");
			
		}else {
			System.out.println("다릅니다.");
		}
		
		System.out.println(m1.toString()); //object클래스의 tostring은 주소값을 리턴함
		
		if(m1 == m2) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("다른객체입니다.");
		}
	}
}
