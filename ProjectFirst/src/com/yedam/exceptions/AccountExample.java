package com.yedam.exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		
		try {
			account.withdraw(100000);
		} catch (BalanceInsufficientException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace(); //에러가 나는 위치를 알려줌
		} finally {
			System.out.println("실행할 메뉴를 선택하쇼");
		}
		
		System.out.println("End of prog");
	}
}
