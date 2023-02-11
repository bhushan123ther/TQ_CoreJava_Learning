package com.loops;

import java.util.Scanner;

public class FactorsOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factors : ");
		int num = sc.nextInt();

		System.out.println("Factors of " + num + " is : ");

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
