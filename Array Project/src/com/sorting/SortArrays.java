package com.sorting;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {

		int arr[] = { 6, 4, 5, 3, 2, 10 };
		System.out.println("Original Array : " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
}
