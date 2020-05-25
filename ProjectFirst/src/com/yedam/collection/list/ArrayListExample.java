package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Hong");
		list.add(2, "Hong");// add는 기존 2번 index에 있던게 뒤로밀림
		list.add(2,"Hwang");
		list.set(2,  "Park"); //set은 기존 2번index에 있던 값을 바꿈
		
		for(String str:list) {
			System.out.println(str.toString());
		}
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		
		list.remove(4);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
