package com.cons_chain;

import java.util.Scanner;

public class CustomerTest3 {

	public static void enterItemDetails(Customer c) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the item name:");
		c.setItemName(sc.next());

		System.out.println("Enter the price:");
		c.setPrice(sc.nextFloat());

		System.out.println("Enter the payment status:");
		c.setStatus(sc.next());

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer c1 = new Customer();
		Customer c2 = new Customer(101, "Sagar", "9077467865");
		Customer c3 = new Customer(102, "Adinath", "7867545680", "DellLaptop", 78000.60f, "FullPaid");

		int choice;

		System.out.println("-------------------------------------------");

		// for customer 1
		System.out.println("---Customer 1-------");
		System.out.println("enter the id:");
		c1.setCid(sc.nextInt());

		System.out.println("enter the name:");
		c1.setCname(sc.next());

		System.out.println("enter the phone number:");
		c1.setPhoneNum(sc.next());

		System.out.println("Do you want to purchase item(1-yes/0-no):");
		choice = sc.nextInt();
		if (choice == 1) {
			enterItemDetails(c1);
		}

		// for customer 2
		System.out.println("---------Customer 2-------------------");
		System.out.println(c2);

		System.out.println("Do you want to purchase item(1-yes/0-no):");
		choice = sc.nextInt();
		if (choice == 1) {
			enterItemDetails(c2);
		}

		System.out.println("----------------------------");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
