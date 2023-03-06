package com.company_ask_prg;

public class HalfSort {

	public static void halfsort(int arr[]) {
		int halfsize = arr.length / 2;
		int temp;
		for (int i = 0; i < halfsize; i++) {
			for (int j = i + 1; j < halfsize; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = halfsize; i < arr.length; i++) {
			for (int j = i + 1; j < halfsize; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 9, 7, 2, 1, 0, 1, 4, 9 };
		halfsort(arr);
	}

}
