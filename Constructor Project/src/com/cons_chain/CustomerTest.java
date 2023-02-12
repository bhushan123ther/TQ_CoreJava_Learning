package com.cons_chain;

import java.util.Scanner;

public class CustomerTest {

	public static void enterItemDetails(Customer c) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer c1 = new Customer();
		Customer c2 = new Customer(101, "Bhushan", "9876543210");
		Customer c3 = new Customer(102, "Bhushan", "8976543610", "HPLaptop", 56000.0f, "FullPaid");

		int choice;

		System.out.println("-----------------------------------------");

		// for customer 1

		System.out.println("Enter the id : ");
		c1.setCid(sc.nextInt());

		System.out.println("Enter the name : ");
		c1.setCname(sc.next());

		System.out.println("Enter the phone number : ");
		c1.setPhoneNum(sc.next());

		System.out.println("Do you want to purchase item (yes-1 / no-0)");
		choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter item name : ");
			c1.setItemName(sc.next());

			System.out.println("Enter price : ");
			c1.setPrice(sc.nextFloat());

			System.out.println("Enter the payment status : ");
			c1.setStatus(sc.next());
		}

		// for customer 2

		System.out.println("-----------------------------------------");

		System.out.println(c2);
		System.out.println("Do you want to purchase items(1-yes / 0-no) : ");
		choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter item name : ");
			c2.setItemName(sc.next());

			System.out.println("Enter price : ");
			c2.setPrice(sc.nextLong());

			System.out.println("Enter the payment status : ");
			c2.setStatus(sc.next());
		}

		System.out.println("-----------------------------------------------");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
