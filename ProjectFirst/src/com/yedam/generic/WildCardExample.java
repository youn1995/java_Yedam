package com.yedam.generic;

import java.util.Arrays;

// <?>, <? extends class>, <? super class>
//Person -> Worker
//		 -> Student -> HighStudent
//Course<T>

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent>
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));

	}

	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고딩"));

		Course<Worker> courseWorker = new Course<Worker>("직장인과정", 5);
//		courseWorker.add(new Person("일반인")); worker class 만 들어올수있음
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStudent = new Course<Student>("학생과정", 5);
		courseStudent.add(new Student("학생")); // Student 타입의 클래스만 들어올수있음
		courseStudent.add(new HighStudent("고딩")); // Student의 자식클래스도 가능

		Course<HighStudent> courseHigh = new Course<HighStudent>("고딩", 5);
		courseHigh.add(new HighStudent("고딩"));

		// Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);

		// Course<? extends class>
//		registerStudent(couresPerson); Student 클래스 ,Student 클래스를 상속받는 하위클래스만 올수있음
		registerStudent(courseStudent);
		registerStudent(courseHigh);

		// Course<? super class>
//		registerWorker(courseStudent); worker클래스, worker클래스의 상위클래스만 올수있음
		registerWorker(courseWorker);
		registerWorker(coursePerson);
	}

}
