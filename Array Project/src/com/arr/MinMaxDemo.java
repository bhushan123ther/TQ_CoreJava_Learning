package com.arr;

public class MinMaxDemo {
	static int maxNum(int ar[]) {
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

	static int minNum(int ar[]) {
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 4, 5, 6, 8 };
		System.out.println("The maximum element of array is : " + maxNum(arr));
		System.out.println("The minimum element  of array is : " + minNum(arr));

	}

}
