package com.loops;

import java.util.Scanner;

public class PrimeAlternateNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int num = 2;

		int count = 1;
		boolean tr = false;
		while (count <= n) {
			boolean flag = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					// System.out.println(num+" is not a prime number");
					flag = false;
					break; // to come out of for loop
				}
			}
			// number is prime
			if (flag) // flag==true
			{
				tr = !tr;
				if (tr)// tr==true
				{
					System.out.println(num);
					count++;

				}
			}

			num++;
		}

	}
}
