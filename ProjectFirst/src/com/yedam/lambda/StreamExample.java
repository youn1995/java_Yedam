package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	static class Employee {
		String name;
		int salary;

		Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Hong", 200), new Employee("Kim", 100));
		list.stream().filter((e) -> e.salary >= 200).forEach((e) -> System.out.println(e.name));
	}
}
