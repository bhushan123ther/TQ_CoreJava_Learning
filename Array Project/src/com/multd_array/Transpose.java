package com.multd_array;

public class Transpose {

	public static void calTranspose(int arr[][]) {
		int rows, cols;
		rows = arr.length;
		System.out.println("Row : " + rows);

		cols = arr[0].length;
		System.out.println("Column : " + cols);

		int trans_arr[][] = new int[cols][rows];

		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				trans_arr[i][j] = arr[j][i];
			}
		}
		System.out.println("Transpose is : ");

		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(trans_arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int myarr[][] = { { 1, 2, 3 }, { 4, 0, 5 } };
		calTranspose(myarr);
	}

}
