package com.loops;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int original_num = num;

		int reverse_num = 0;

		int rem;

		while (num != 0) {
			rem = num % 10;
			reverse_num = (reverse_num * 10) + rem;
			num /= 10;
		}
		if (reverse_num == original_num) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
