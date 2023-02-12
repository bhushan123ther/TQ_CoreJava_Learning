package com.arr;

public class ReverseArray {

	static void reverseArr(int arr[]) {
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j++] = arr[i];
		}

		printArray(temp);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}

	static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Array : ");
		printArray(arr);

		System.out.println();

		System.out.println();

		System.out.println("Reverse : ");
		// printArray(arr);
		reverseArr(arr);
	}
}
