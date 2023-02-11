package com.loops;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table : ");
		int num = sc.nextInt();

		System.out.println("--------------------------------");
		System.out.println("Table of " + num);
		System.out.println("--------------------------------");
		int table;

		for (int i = 1; i <= 20; i++) {
			table = num * i;
			System.out.println(num + " X " + i + " = " + table);
		}
	}
}
