package com.demo;

import java.util.Scanner;

public class FirstOccurernce {
	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void searchArray(int arr[], int value) {
		boolean status = false;
		int pos = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				pos = i;
				break;
			}
		}
		System.out.println("Element present at index : " + pos);
	}

	public static void main(String[] args) {
		System.out.print("Enter the size : ");
		int size = sc.nextInt();

		int myarray[] = new int[size];
		enterArray(myarray);

		System.out.println("---------------------------------------------");
		System.out.println("Enter the element to search : ");
		int ele = sc.nextInt();

		searchArray(myarray, ele);

	}

}
