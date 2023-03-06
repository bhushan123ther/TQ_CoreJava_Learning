package com.sorting;

public class SecondHighWithoutSorting {
	public static void secondHighest(int arr[]) {
		int highest = Integer.MIN_VALUE;
		int sec_highest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				sec_highest = highest;
				highest = arr[i];
			}
			if ((arr[i] < highest) && (arr[i] > sec_highest)) {
				sec_highest = arr[i];
			}
		}
		System.out.println("Second Highest :" + sec_highest);
	}

	public static void main(String[] args) {
		int arr[] = { 4, 6, 3, 7, 2, 5 };
		secondHighest(arr);
	}
}
