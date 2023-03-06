package com.multd_array;

public class AddMatrix {

	public static void addMatrix(int m[][], int n[][]) {
		int rows = n.length;
		int cols = n[0].length;

		int addM[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				addM[i][j] = m[i][j] + n[i][j];
			}
		}

		System.out.println("Array after addition : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(addM[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 4, 0, 5 }, { 6, 7, 8 } };
		int arr2[][] = { { 1, 8, 5 }, { 2, 0, 1 }, { 0, 2, 1 } };

		addMatrix(arr1, arr2);
	}

}
