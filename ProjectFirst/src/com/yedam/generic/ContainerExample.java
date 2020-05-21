package com.yedam.generic;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "저시기");
		String str1 = container1.getObj();
		String str2 = container1.getValue();
		Container<String,Integer> container2 = new Container<String ,Integer>();
		container2.set("김참참", 10);
		String value = container2.getObj();
		int value1 = container2.getValue();
		System.out.println(str1 + str2);
		System.out.println(value+ value1);
	}
}
