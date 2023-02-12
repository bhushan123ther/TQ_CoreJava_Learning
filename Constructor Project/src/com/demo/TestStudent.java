package com.demo;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// default constructor
		Student s1 = new Student();
		s1.display();

		// parameterized constructor
		System.out.println("--------------------------------");
		Student s2 = new Student(101, "Ram", 98.5f);
		s2.display();

		System.out.println("===================");
		Student s4 = new Student(103, "Sneha", 88.5f, "Mary school");
		s4.display();

		System.out.println("===================");
		Student s5 = new Student(105, "Adinath");
		s5.display();

		System.out.println("===================");

		// user input

		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks:");
		float marks = sc.nextFloat();

		Student s3 = new Student(id, name, marks);
		// tight coupling
		s3.display();

	}

}
