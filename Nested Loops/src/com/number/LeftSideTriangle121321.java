package com.number;

public class LeftSideTriangle121321 {

	public static void main(String[] args) {
		int n;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			n = i;
			for (int k = 1; k <= i; k++) {

				System.out.print(n);
				n--;
			}
			System.out.println();
		}
	}

}
