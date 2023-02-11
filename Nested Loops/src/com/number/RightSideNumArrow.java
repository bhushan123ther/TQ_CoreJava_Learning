package com.number;

public class RightSideNumArrow {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int k = 1; k <= 4; k++) {
			for (int l = 1; l <= (5 - k); l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
/*
 * 
 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
 * 
 */