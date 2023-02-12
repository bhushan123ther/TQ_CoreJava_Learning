package com.arr;

public class EvenOddArrya {

	public static void main(String[] args) {

		int myarr[] = new int[10];

		int arr[] = { 3, 4, 5, 6, 7, 8, 13, 11 };

		System.out.println("Length of array is : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even element : " + arr[i]);
			} else {
				System.out.println("Odd element : " + arr[i]);
			}
		}
	}

}
