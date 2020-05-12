package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent{
//	Child() {
//		super(); private이라 못씀
//	}
	
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber); //public이라 가능
	}
	
	
	
}
