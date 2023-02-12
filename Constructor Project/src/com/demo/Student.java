package com.demo;

public class Student {
	private int id;
	private String name;
	private float marks;
	private String schoolName;

	public Student() {
		System.out.println("In default constructor");
		this.id = 100;
		this.name = "Unknown";
		this.marks = 20.0f;
		this.schoolName = "No school";
	}

	public Student(int id, String name) {
		System.out.println("IN Parameterized constructor 3");
		this.id = id;
		this.name = name;
		this.marks = 40.f;
		this.schoolName = "Raje school";
	}

	public Student(int id, String name, float marks) {
		System.out.println("In parameterized constructor 1");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.schoolName = "Raje school";
	}

	public Student(int id, String name, float marks, String schoolname) {
		System.out.println("In parameterized constructor 2");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.schoolName = schoolname;
	}

	public void display() {
		System.out.println(id + " " + name + " " + marks + " " + schoolName);
	}
}
