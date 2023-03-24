package com.diamond;

public class School implements Teacher, Student {

	public void display() {
		Student.super.display();
		Teacher.super.display();
	}

	public static void main(String[] args) {

		School s = new School();
		s.display();

	}

}
