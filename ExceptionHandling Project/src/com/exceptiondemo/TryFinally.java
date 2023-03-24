package com.exceptiondemo;

public class TryFinally {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 7, 0, 3 };

		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] / arr[i + 1];
				System.out.println(arr[i]);
			}
		} finally {
			System.out.println("close the array ");
		}
		// catch block is handled by JVM internally.
	}

}
