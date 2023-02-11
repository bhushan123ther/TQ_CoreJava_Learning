package com.alp;

public class RightAnglePattern {

	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char cj = 'A'; cj <= ch; cj++) {
				System.out.print(cj + " ");
			}
			System.out.println();
		}

	}
}
