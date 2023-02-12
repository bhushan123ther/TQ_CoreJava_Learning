package com.arr;

import java.util.Scanner;

public class SumOfEvenUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many element do you want to enter in an array : ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				sum += arr[j];
			}
		}

		System.out.println("Sum of even number is : " + sum);
	}

}
