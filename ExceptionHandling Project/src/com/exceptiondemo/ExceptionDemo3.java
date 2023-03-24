package com.exceptiondemo;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 7, 0, 3 };
		try {

			for (int i = 0; i <= arr.length; i++) {
				arr[i] = arr[i] / arr[i + 1];

				System.out.println(arr[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("divide by zero exception");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check your array index");
		}

		catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		System.out.println("Hello");
	}
}
