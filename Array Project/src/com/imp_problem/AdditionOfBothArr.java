package com.imp_problem;

public class AdditionOfBothArr {

	public static void main(String[] args) {

		int a[] = { 4, 5, 7, 1, 2, 8 };
		int b[] = { 1, 0, 4, 2, 3 };

		int[] c = new int[a.length + b.length];

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i + j] += a[i] * b[j];
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
