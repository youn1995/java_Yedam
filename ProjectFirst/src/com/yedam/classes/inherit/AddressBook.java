package com.yedam.classes.inherit;

import java.util.Scanner;

public class AddressBook {
	Scanner scn = new Scanner(System.in);
	Friend[] peopleList = new Friend[100];

	void inputAddress() {
		String name = null;
		String phone = null;
		String major = null;
		String department = null;
		int selnum = 1;

		System.out.println("주소록 생성");
		System.out.println("1.친구, 2.대학, 3.회사");
		System.out.print("입력>");
		selnum = scn.nextInt();
		scn.nextLine();
		System.out.println("V 이름입력 V");
		name = scn.nextLine();
		System.out.println("V 전화번호 입력 V");
		phone = scn.nextLine();

		if (selnum == 2) {
			System.out.println("V 전공 입력 V");
			major = scn.nextLine();
		} else if (selnum == 3) {
			System.out.println("V 부서 입력 V");
			department = scn.nextLine();
		}

		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i] == null && selnum == 1) {
				peopleList[i] = new Friend(name, phone);
				break;
			} else if (peopleList[i] == null && selnum == 2) {
				peopleList[i] = new University(name, phone, major);
				break;
			} else if (peopleList[i] == null && selnum == 3) {
				peopleList[i] = new Company(name, phone, department);
				break;
			}
		} // end of for

		System.out.println("주소록 생성 완료");
	}

	void addressList() {
		System.out.println("주소록 조회");
		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i] != null) {
				System.out.println("------------------");
				peopleList[i].showInfo();
			} //else if (peopleList[i] == null) {
				//break;
			//}
		}
	}

	void findWho() {
		System.out.println("친구 찾기 선택");
		System.out.print("조회 할 이름 >");
		String name = scn.nextLine();
		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i] != null && peopleList[i].getName().equals(name)) {
				peopleList[i].showInfo();
				break;
			} else {
				System.out.println("조회한 이름이 없습니다.");
			}
		}
	}

	public void execute() {
		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.주소록 생성, 2.주소록 조회, 3.친구 찾기, 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				inputAddress();
			} else if (selectNo == 2) {
				addressList();
			} else if (selectNo == 3) {
				findWho();
			} else if (selectNo == 4) {
				break;
			} else {
				System.out.println("입력이 잘못 되었습니다.");
			}
		} // end of while
		System.out.println("프로그램 종료");
	}// end of execute

}// end of class
