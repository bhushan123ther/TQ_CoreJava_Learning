package com.loops;

import java.util.Scanner;

public class AlternateOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num * 2; i += 2) {
			int n = i * 3;
			System.out.println(n);
		}
	}

}
