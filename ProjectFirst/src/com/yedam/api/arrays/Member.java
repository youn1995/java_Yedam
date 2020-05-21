package com.yedam.api.arrays;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		//return o.name.compareTo(name); //내림차순
		return name.compareTo(o.name); //오름차순
	}
}
