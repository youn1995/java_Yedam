package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent{

	Child() {
		super(); //private이면 못씀
	}
	
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber); //public이라 가능
	}
	//protected 구분.
	
	void showInfo() {
		Child child = new Child();
		//child.getLastName(); //default x
		child.getFirstName(); //protected o
		child.getTelNumber(); // public o
	}
	
	
}
