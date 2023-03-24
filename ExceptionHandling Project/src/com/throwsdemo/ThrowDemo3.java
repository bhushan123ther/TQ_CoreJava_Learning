package com.throwsdemo;

import java.util.Scanner;

public class ThrowDemo3 {

	static void validate(String n) {
		if (n.length() < 3) {
			throw new StringIndexOutOfBoundsException("Name length should be greater than 2");
		} else {
			System.out.println("Welcome " + n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();

		validate(name);

	}

}
