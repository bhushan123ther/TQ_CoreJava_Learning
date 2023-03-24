package com.exceptiondemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int num1 = 89;
		int num2 = 0;

		try {
			int result = num1 / num2;
			System.out.println("Result : " + result);
		} catch (Exception e) {
			// System.out.println("Cannot divide by zero");
			// System.out.println(e);
			System.out.println("Exception occured : " + e.getMessage());
		}
		System.out.println("Hello Java");
	}

}
