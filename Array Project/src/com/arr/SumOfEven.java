package com.arr;

public class SumOfEven {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 5, 6, 7, 8, 11, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of all even element in an array is : " + sum);
	}

}
