package com.exception_assignment;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Hello ");
		} catch (Exception e) {

			System.out.println("Exception : " + e);
		}

	}

}
