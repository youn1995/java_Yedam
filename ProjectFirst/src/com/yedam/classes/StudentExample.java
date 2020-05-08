package com.yedam.classes;

public class StudentExample {

	public static void main(String[] args) {
		Student stu = new Student();

		stu.name = "Youn";
		stu.age = 26;
		stu.height = 177.5;
		stu.weight = 75.1;
		stu.study();
		stu.eat("banana");
		stu.exercise();

		System.out.println(stu.name + ", " + stu.age);

		Student stu1 = new Student();
		stu1.name = "Hyee";
		stu1.age = 31;
		stu1.height = 180;
		stu1.weight = 70.1;
		stu1.study();
		stu1.eat("HAM");
		stu1.exercise();
		System.out.println(stu1.name + ", " + stu1.age);

		System.out.println();

		Student stu2 = new Student("Choi");
		stu2.age = 211;
		stu2.height = 1180;
		stu2.weight = 701.1;
		stu2.study();
		stu2.eat("HAAAM");
		stu2.exercise();
		System.out.println(stu2.name + ", " + stu2.age);

		Student[] s1 = new Student[4];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		s1[3] = new Student();
		
		for(Student stud: s1) {
			System.out.println(stud.name + "/ "+stud.age);
		}

		/*
		People peo = new People();
		peo.name = "Kim";
		peo.contry = "USA";
		peo.age = 15;
		peo.see("자유의 여신상");
		peo.run(10.5);
		peo.eat("햄버거");
		peo.showInfo();
		*/
	}

}
