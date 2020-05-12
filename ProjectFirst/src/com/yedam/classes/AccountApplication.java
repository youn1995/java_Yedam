package com.yedam.classes;

import java.util.Scanner;

public class AccountApplication {
	private Scanner scn = new Scanner(System.in); // ctrl shift o
	private Account[] accounts = new Account[100];

	// 1.계좌생성
	private void createAccount() {
		System.out.println("계좌 생성 선택");
		System.out.println("계좌번호 입력 >");
		String ano = scn.nextLine();
		System.out.println("예금주 입력>");
		String owner = scn.nextLine();
		System.out.println("금액 입력>");
		int balance = scn.nextInt();
		scn.nextLine();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				break;
			}
		} // end of for
		System.out.println("계좌 생성 완료");
	}// end of createAccount

	// 2.계좌목록
	private void accoutList() {
		System.out.println("계좌 목록 선택");

		for (Account acc : accounts) {
			if (acc != null) {
				System.out.println("계좌번호: " + acc.getAno());
				System.out.println("예금주: " + acc.getOwner());
				System.out.println("잔액: " + acc.getBalance());
				System.out.println();
			} else if (acc == null) {
				break;
			}
		} // end of for
	}// end of accoutList

	// 3.입금
	private void deposit() {
		System.out.println("예금 선택");
		System.out.println("계좌번호를 입력하세요");
		String ano = scn.nextLine();
		System.out.println("예금액을 입력하세요");
		int balance = scn.nextInt();
//		for (int i = 0; i < accounts.length; i++) {
//			// 전체배열중에 값이 있는경우 && 입력계좌번화 동일한 건에 처리
//			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
//				int result = accounts[i].getBalance();
//				accounts[i].setBalance(result + balance);
//				break;
//			}
//		} // end of for
		Account acnt = findAccount(ano);
		if(acnt != null) {
			acnt.setBalance(acnt.getBalance()+balance);
			System.out.println("예금 처리 완료");
			} else {
				System.out.println("해당 계좌가 없습니다.");
			}
	}// end of deposit

	// 4.출금
	private void withdraw() {
		System.out.println("출금 선택");
		System.out.println("계좌번호를 입력하세요");
		String ano = scn.nextLine();
		System.out.println("출금액을 선택하세요");
		int balance = scn.nextInt();
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
//				int result = accounts[i].getBalance();
//				accounts[i].setBalance(result - balance);
//				break;
//			}
//		} // end of for
		Account acnt = findAccount(ano);
		if(acnt != null) {
		acnt.setBalance(acnt.getBalance()-balance);
		System.out.println("출금 처리 완료");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
			
	}// end of withdraw
		
	// 5.종료
	// 6. 계좌번호를 입력하면 해당 account를 반환해주는 메소드
	private Account findAccount(String ano) {
		for (int i=0; i<accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}
		return null;
	}
	public void execute() {
		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌 생성, 2.계좌 목록, 3.예금, 4.출금, 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accoutList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("종료 선택");
				break;
			} else {
				System.out.println("입력이 잘못 되었습니다.");
			}

		} // end of while
		System.out.println("프로그램 종료");
	}// end of execute

}// end of class
