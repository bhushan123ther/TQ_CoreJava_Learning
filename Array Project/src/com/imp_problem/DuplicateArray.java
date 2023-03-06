package com.imp_problem;

import java.util.Scanner;

public class DuplicateArray {
	static Scanner sc = new Scanner(System.in);

	public static void duplicateElement(int ar[]) {
		int i, j, frequency;
		int count = 0;
		System.out.println("Duplicate Number  ->  Frequency");
		for (i = 0; i < ar.length; i++) {
			frequency = 1;
			for (j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					frequency++;
					System.out.println(ar[j] + " -> " + frequency);
				}
			}
		}
		System.out.println("Number of duplicate element in an array : " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 3, 2 };
		duplicateElement(arr);
	}
}
