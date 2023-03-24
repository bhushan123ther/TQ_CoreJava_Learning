package com.throwsdemo;

import java.util.Scanner;

public class ThrowDemo {

	static void validate(int a) {
		if (a < 18) {
			throw new ArithmeticException();
		} else {
			System.out.println("Can vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age : ");
		int age = sc.nextInt();

		try {
			validate(age);
		} catch (Exception e) {
			System.out.println("Person cannot vote");
		}

	}

}
