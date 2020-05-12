package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class ParentEx {
	public static void main(String[] args) {
		
		Parent parent = new Parent("kim", "kikik", "111-111");
		//parent.getLastName(); //default
		//parent.getFirstName(); //protected
		parent.getTelNumber(); //public
	
	}
}