package com.throwsdemo;

import java.util.Scanner;

public class ThrowDemo2 {

	public static void checkMarks(float marks) {
		if ((marks < 0) || (marks > 100)) {
			throw new ArithmeticException("Marks shoud be in between 0 and 100");
		} else {
			System.out.println(marks);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks : ");
		float marks = sc.nextFloat();

		checkMarks(marks);
	}

}
