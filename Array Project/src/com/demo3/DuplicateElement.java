package com.demo3;

public class DuplicateElement {

	public static void printDuplicate(int arr[]) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] == '\0')
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
					arr[j] = '\0';
					break;
				}
			}
		}
		System.out.println("Number of duplicate element : " + counter);
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
