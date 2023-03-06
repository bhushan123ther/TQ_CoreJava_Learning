package com.demo;

import java.util.Scanner;

public class AlternateElement {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void printAlternate(int arr[]) {
		boolean flag = true;
		for (int i : arr) { // i is the value

			if (flag) {
				System.out.print(i + " ");
			}
			flag = !flag;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		int myarray[] = new int[size];
		enterArray(myarray);

		System.out.print("Alternate elements are : ");
		printAlternate(myarray);
	}

}
