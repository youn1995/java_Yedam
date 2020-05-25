package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	static class Member { //중첩클래스
		String name;
		int age;
		Member(String name, int age){
			this.name = name;
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Hello");
//		list.add("World");
//		list.add("Hi");
//		list.add(3, "Kong");
//
//		String str1 = list.get(0);// hello
//		list.remove(3);
//
////		for(int i = 0; i<list.size(); i++) {
////			System.out.println(list.get(i));
////		}
//
//		for (String str : list) {
//			System.out.println(str);
//		}
		List<Member> members = new ArrayList<>();
		members.add(new Member("Hong", 29));
		members.add(new Member("Kong", 23));
		members.add(new Member("Mong", 19));
		
		for(Member mem: members) {
			System.out.println(mem.getName()+", "+mem.getAge());
		}
	}
}
