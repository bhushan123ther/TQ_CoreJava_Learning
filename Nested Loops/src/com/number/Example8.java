package com.number;

public class Example8 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}

	}

}
