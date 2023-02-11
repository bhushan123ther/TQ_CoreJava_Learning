package com.alp;

public class PyaramidSpaceAABABC {

	public static void main(String[] args) {
		char ch = 'A';
		char temp;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= (7 - i); j++) {
				System.out.print(" ");
			}
			temp = ch;
			for (int k = 1; k <= i; k++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}

	}

}
