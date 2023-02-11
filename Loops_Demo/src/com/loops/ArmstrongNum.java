package com.loops;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int original_num = num;
		int digit = 0;
		int armNum = 0;

		int rem;

		while (num != 0) {
			num /= 10;
			digit++;
		}

		System.out.println("Digits are : " + digit);

		num = original_num;
		while (num != 0) {
			rem = num % 10;
			num /= 10;

			int n = 1;

			for (int i = 1; i <= digit; i++) {
				n = n * rem;
			}
			armNum += n;
		}

		if (armNum == original_num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
