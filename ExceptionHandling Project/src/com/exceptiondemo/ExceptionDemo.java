package com.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {

		float a = 90;
		float b = 0;

		float c = a / b;
		System.out.println(c); // Infinity because it converted into fraction

		/*
		 * int a = 100; int b = 0; int c = a / b; System.out.println(c); // Exception in
		 * thread "main" java.lang.ArithmeticException: / by zero
		 */

	}

}
