package com.imp_problem;

import java.util.Arrays;

public class NeibhorSum {

	public static void main(String[] args) {

		int arr[] = { 6, 2, 4, 1, 7, 3 };

		int size = arr.length;

		int newArr[] = new int[size];

		int j;
		for (j = 0; j < arr.length - 1; j++) {

			newArr[j] = arr[j] + arr[j + 1];
		}
		newArr[j] = arr[j];
		System.out.println(Arrays.toString(newArr));

	}

}
