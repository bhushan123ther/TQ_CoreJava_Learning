package com.loops;

import java.util.Scanner;

public class SumOfNaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter natural number to print sum : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum of " + num + " number is : " + sum);
	}
}
