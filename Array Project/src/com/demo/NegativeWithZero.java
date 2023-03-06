package com.demo;

public class NegativeWithZero {

	public static void replaceNegative(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
		}

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {

	}

}
