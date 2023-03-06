package com.imp_problem;

public class HAscendingHDescending {

	public static void halfAscHalfDsc(int arr[]) {
		int sec_part = arr.length / 2;
		// System.out.print(arr[sec_part]);

		int temp, temp1;

		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = i + 1; j < arr.length / 2; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = sec_part; i < arr.length; i++) {
			for (int j = sec_part; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp1 = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp1;
				}
			}
		}

		System.out.println("Half Ascending and half Descending array : ");

		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = sec_part; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 4, 5, 6, 7, 8 };

		halfAscHalfDsc(arr);
	}

}
