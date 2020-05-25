package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.age;

	}

	@Override
	public int hashCode() {
//		return this.age; //나이기준으로만
		return name.hashCode(); //이름기준으로만 
	}

	@Override
	public boolean equals(Object obj) { 
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		members.add(new Member("Hong", 10)); //hashCode(), equals() 재정의 여부에 따라 결과가 달라짐
		members.add(new Member("Hong", 20));
		members.add(new Member("Hong", 10));
		
		for(Member member:members) {
			System.out.println(member.toString());
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("world");
		set.add("Hello"); // set은 중복값을 허용하지않음

		for (String str : set) {
			System.out.println(str.toString());
		}
	}
}
