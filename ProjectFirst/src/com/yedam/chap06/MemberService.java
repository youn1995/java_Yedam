package com.yedam.chap06;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되셨습니다.");
		}
	}
	
	
	
}
