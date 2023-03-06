package com.multd_array;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int myarr[][] = new int[3][2];

		System.out.println("Enter array elements : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				myarr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(myarr[i][j] + " ");
			}
			System.out.println();
		}

		int arr[][] = { { 1, 2, 4 }, { 6, 7, 8 }, { 9, 0, 2 } };

	}

}
