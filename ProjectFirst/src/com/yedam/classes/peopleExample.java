package com.yedam.classes;

public class peopleExample {

	public static void main(String[] args) {
		
		People p1 = new People("Kim", "USA", 15);
		People p2 = new People("Park", "ROK", 20);
		People p3 = new People("Choi", "Japan", 60);
		
		
		People[] peo = new People[3];
		peo[0] = p1;
		peo[1] = p2;
		peo[2] = p3;
		
		for(People p : peo) {
			p.showInfo();
		}
		
		
	}
	
}
