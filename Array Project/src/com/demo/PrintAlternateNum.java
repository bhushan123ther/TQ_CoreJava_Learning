package com.demo;

import java.util.Scanner;

public class PrintAlternateNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element do you want to enter : ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elemenets : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length; j = j + 2) {
			System.out.print(arr[j] + " ");
		}
	}

}
