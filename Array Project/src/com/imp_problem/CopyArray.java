package com.imp_problem;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 6, 7, 8 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		/*
		 * int copy_arr[] = new int[arr.length];
		 * 
		 * for (int i = 0; i < arr.length; i++) { copy_arr[i] = arr[i]; }
		 * System.out.println("Copy Array : " + Arrays.toString(copy_arr));
		 * 
		 * arr[2] = 8; System.out.println("Original Array : " + Arrays.toString(arr));
		 * System.out.println("Copy Array : " + Arrays.toString(copy_arr));
		 */

		/*
		 * int copy_arr1[] = Arrays.copyOf(arr, arr.length);
		 * System.out.println("Copy : " + Arrays.toString(copy_arr1));
		 * 
		 * arr[2] = 7; System.out.println("Original:" + Arrays.toString(arr));
		 * System.out.println("Copy:" + Arrays.toString(copy_arr1));
		 * 
		 */

		int copy_arr2[] = arr.clone();
		System.out.println("Copy : " + Arrays.toString(copy_arr2));

		arr[2] = 7;

		System.out.println("Original : " + Arrays.toString(arr));
		System.out.println("Copy : " + Arrays.toString(copy_arr2));
	}

}
