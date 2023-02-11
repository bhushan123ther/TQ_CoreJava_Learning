package com.number;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 3; i++) { for (int j = 1; j <= 3; j++) {
		 * System.out.print(j + " "); } System.out.println(); }
		 */
		int n;
		for (int i = 0; i <= 2; i++) {
			n = 1;
			for (int j = 0; j <= 2; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}

}
