package com.yedam.interfaces;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { // 익명객체
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}

}

interface Action {
	void work();
}