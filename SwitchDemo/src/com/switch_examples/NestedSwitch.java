package com.switch_examples;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Course : ");
		String course = sc.next();

		System.out.println("Enter subject : ");
		String subject = sc.next();

		switch (course) {
		case "Computer":
			switch (subject) {
			case "OS":
				System.out.println("Operating System");
				break;

			case "Net":
				System.out.println("Networking");
				break;

			case "SE":
				System.out.println("Software Engineering");
				break;

			default:
				System.out.println("No subject in computer stream");
			}
			break;

		case "Electric":
			switch (subject) {
			case "Cr":
				System.out.println("Circuit");
				break;

			case "EG":
				System.out.println("Electrical Get's");
				break;

			case "DE":
				System.out.println("Digital Electronic");
				break;

			default:
				System.out.println("No subject in computer stream");
			}
			break;
		default:
			System.out.println("No Course  available.");
		}
	}
}
