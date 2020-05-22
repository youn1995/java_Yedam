package com.yedam.api.arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은인덱스: "+index);
		
		//문자열 검색
		String[] names = {"홍길동", "박동수","김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "박동수");
		System.out.println(index + "에 해당이름이 이써어요");
		
		//객체검색
		Member m1 =new Member("홍감감");
		Member m2 =new Member("홍감찬");
		Member m3 =new Member("홍감속");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스"+ index);
	}
}
