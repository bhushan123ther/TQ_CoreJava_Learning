package com.arr;

public class PruductOfAllNums {
	static long findProd(int ar[]) {
		int prod = 1;

		for (int i = 0; i < ar.length; i++) {
			prod *= ar[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 5, 1 };
		System.out.println("Product of all numbers in an array : " + findProd(arr));
	}

}
