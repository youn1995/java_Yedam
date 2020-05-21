package com.yedam.api.arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i < scores.length; i++) {
			System.out.println("scores["+i+"]= "+scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동창", "김장만"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]=" + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동"); //Member의 오러라이딩된 compareTO를 재정의 해서 오름차순과 내림차순을 바꿀수있음
		Member m2 = new Member("박동창");
		Member m3 = new Member("김장만");
		
		 Member[] members = {m1,m2,m3};
		 Arrays.sort(members);
		 for(int i=0; i<members.length; i++) {
			 System.out.println("members ["+i+"]= "+members[i].name);
		 }
	}
}
