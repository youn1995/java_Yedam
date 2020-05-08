package com.yedam.classes;

public class StringExample {
	public static void main(String[] args) {
		/*
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		*/
		
		
		String inputStr = "Youn";
		
		Student stu = new Student("Youn");
		stu.age = 26;
		stu.height = 177.5;
		stu.weight = 75.1;


		Student stu1 = new Student("Hyee");
		stu1.age = 31;
		stu1.height = 180;
		stu1.weight = 70.1;


		Student stu2 = new Student("Choi");
		stu2.age = 211;
		stu2.height = 1180;
		stu2.weight = 701.1;

		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		for(Student stud: s1) {
			if(inputStr.equals(stud.name)) {
			System.out.println(stud.name + "/ "+stud.age);
			}
		}
		
		
	}
}
