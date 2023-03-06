package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		System.out.println("Bubble sort is : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 2, 4 };

		System.out.println("Before Sorting : ");

		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("After Sorting : ");

		System.out.println(Arrays.toString(arr));
	}
}
