package com.switch_examples;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month : ");
		int mnt = sc.nextInt();

		switch (mnt) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
		case 12:
			System.out.println("31 days are present in this month");
			break;
		case 2:
			System.out.println("28/29 days are present in this month");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("30 days are present in this month");
			break;

		default:
			System.out.println("Wrong Input");
			break;

		}
	}
}
