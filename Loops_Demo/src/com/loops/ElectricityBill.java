package com.loops;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units of electricity : ");
		double units = sc.nextFloat();
		double bill;
		if (units <= 50) {
			bill = (0.50 * units);
		} else if (units <= 150) {
			bill = 25 + (units - 50) * 0.75;
		} else if (units <= 250) {
			bill = 100 + (units - 150) * 1.20;
		} else {
			bill = 220 + (units - 250) * 1.50;
		}

		System.out.println("Bill of electricity : " + bill);
	}

}
