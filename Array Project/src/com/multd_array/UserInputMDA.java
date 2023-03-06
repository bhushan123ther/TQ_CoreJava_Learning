package com.multd_array;

import java.util.Scanner;

public class UserInputMDA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row of array : ");
		int row = sc.nextInt();

		System.out.println("Enter column of array : ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter values of rows and columns : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("values of multidimentional array : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
