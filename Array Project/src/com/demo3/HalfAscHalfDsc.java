package com.demo3;

public class HalfAscHalfDsc {

	public static void halfAscHalfDsc(int arr[]) {
		int len = arr.length;

		int temp, temp1;

		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 6, 7, 8, 9 };

		halfAscHalfDsc(arr);
	}

}
