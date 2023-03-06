package com.company_ask_prg;

public class DuplicateElement {

	public static void findDuplicate(int arr[]) {
		int count = 0;
		int frequency = 0, i, j;
		for (i = 0; i < arr.length; i++) {
			frequency = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					frequency++;
					System.out.println(arr[j]);
					count++;
				}
			}
		}
		if (frequency > 1) {
			System.out.println(arr[i] + " : " + frequency);
		}
		System.out.println("Number of duplicate : " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 7, 7, 3, 5, 3, 7, 4, 1 };
		findDuplicate(arr);
	}
}
