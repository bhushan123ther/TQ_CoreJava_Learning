package com.override;

import java.util.Scanner;

public class InputBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number : ");
		int num = sc.nextInt();

		try {
			while (num > 0) {
				int rem = num % 10;
				if ((rem != 1) && (rem != 0)) {

				}
				num /= 10;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
