package com.imp_problem;

import java.util.Scanner;

public class PrimeNumInArray {

	public static void printPrime(int arr[]) {

		System.out.println("Prime element of an array's  are : ");
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;

			if ((arr[i] != 0) && (arr[i] != 1)) {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		printPrime(arr);
	}

}
