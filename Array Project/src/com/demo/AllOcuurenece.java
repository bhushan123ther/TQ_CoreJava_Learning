package com.demo;

import java.util.Scanner;

public class AllOcuurenece {
	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void searchArrayPos(int arr[], int value) {
		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				status = true;
				System.out.println("Element present at index : " + i);
			}
		}
		if (!status) {
			System.out.println("Element not present in an array");
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the size : ");
		int size = sc.nextInt();

		int myarray[] = new int[size];
		enterArray(myarray);

		System.out.println("---------------------------------------------");
		System.out.println("Enter the element to search : ");
		int ele = sc.nextInt();

		searchArrayPos(myarray, ele);
	}
}
