package com.loops;

import java.util.Scanner;

public class PrimeSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int num = 2;

		int count = 1;
		while (count <= n) {
			boolean flag = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) { //
					// System.out.print("Not palindrome");
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
}
