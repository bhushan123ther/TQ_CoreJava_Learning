package com.arr;

public class ForEachDemo {
	static void checkFor(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i];
		}
	}

	static void checkForEach(int arr[]) {
		for (int i : arr) {
			i = i + 2;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 6, 4, 2, 3, 10 };
		checkForEach(arr);

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
