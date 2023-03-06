package com.imp_problem;

import java.util.Scanner;

public class AlternateMerge {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int arr[]) {
		System.out.println("Enter array element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void mergeArr(int arr1[], int arr2[]) {
		int size1 = arr1.length;
		int size2 = arr2.length;

		int arr3[] = new int[size1 + size2];

		int k = 0;
		int i, j;
		for (i = 0, j = 0; i < size1 && j < size2; i++, j++) {
			arr3[k++] = arr1[i];
			arr3[k++] = arr2[j];
		}
		// remainging element store

		while (i < size1) {
			arr3[k++] = arr1[i++];
		}
		while (j < size2) {
			arr3[k++] = arr2[j++];
		}
		printArr(arr3);
	}

	public static void main(String[] args) {
		int arr1[] = new int[3];
		int arr2[] = new int[5];

		enterArray(arr1);
		enterArray(arr2);

		mergeArr(arr1, arr2);
	}

}
