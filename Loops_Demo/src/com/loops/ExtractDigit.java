package com.loops;

import java.util.Scanner;

public class ExtractDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int rem;
		while (num != 0) {
			rem = num % 10;
			System.out.println(rem);
			num /= 10;
		}

	}
}
