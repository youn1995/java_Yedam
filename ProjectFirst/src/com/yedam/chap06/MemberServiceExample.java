package com.yedam.chap06;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memSer = new MemberService();
		boolean result = memSer.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memSer.logout("hong");
		} else {
			System.out.println("아이디 또는 비밀번호를 다시한번 확인해주세요.");
		}
	}
}
