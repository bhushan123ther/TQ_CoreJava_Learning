package com.alp;

public class RightAngleABBCCC {
	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char chr = 'A'; chr <= ch; chr++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
