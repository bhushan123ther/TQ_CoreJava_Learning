package com.number;

public class RightSideNumArrow2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int k = 1; k <= 7; k++) {
			for (int l = 1; l <= (8 - k); l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
