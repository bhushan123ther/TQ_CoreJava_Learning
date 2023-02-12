package com.demo;

public class AnonymousObject {

	public static void main(String[] args) {

		new Student(120, "Vaishnavi", 98.6f, "St Mary Convent").display();
		System.out.println("===========================");
		new Student(130, "Sagar", 90.6f, "St Mary Convent").display();
		System.out.println("===========================");
		new Student(140, "Suyog").display();
		System.out.println("===========================");
		new Student(150, "Tejas", 98.6f).display();
		System.out.println("===========================");
		new Student().display();

	}

}
