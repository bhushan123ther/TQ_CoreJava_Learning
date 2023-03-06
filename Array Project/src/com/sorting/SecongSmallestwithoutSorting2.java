package com.sorting;

public class SecongSmallestwithoutSorting2 {
	public static void secondSmallest(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int secondsm = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondsm = smallest;
				smallest = arr[i];
			}
			if ((arr[i] > smallest) && (arr[i] < secondsm)) {
				secondsm = arr[i];
			}
		}

		System.out.println("Second smallest:" + secondsm);
	}

	public static void main(String args[]) {
		int myarr[] = { 4, 6, 3, 5, 7, 2 };

		secondSmallest(myarr);
	}

}
