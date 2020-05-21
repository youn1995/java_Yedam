package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public static void main(String[] args) {
		Object[] strAry = new Object[5];
		strAry[0] = "Hello";
		strAry[1] = new Integer(0);
		
		String str = (String) strAry[0];
		Integer num = (Integer) strAry[1];
		Integer num1 = (Integer) strAry[0];
		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.3));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double d1 = (Double) list.get(2);
		Double d2 = (Double) list.get(0); //에러는 없지만 컴파일하면 에러발생
 		
		//제네릭
		List<String> strList = new ArrayList<String>(); //해당타입만 받을수있도록 파라미터를 사용
		strList.add(new String("Hello"));
 		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
 		
	}
}
