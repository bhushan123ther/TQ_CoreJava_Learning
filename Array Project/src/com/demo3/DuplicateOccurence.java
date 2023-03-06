package com.demo3;

public class DuplicateOccurence {

	public static void printDuplicate(int arr[]) {
		int count;
		int dcount = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if (arr[i] == '\0')
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '\0';
				}
			}
			if (count > 1) {
				System.out.println("Element " + arr[i] + " : " + count);
				dcount++;
			}
		}
		System.out.println("Number of duplicate elements are:" + dcount);
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 4, 7, 9, 8, 0, 7 };

		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		printDuplicate(arr);

	}

}
