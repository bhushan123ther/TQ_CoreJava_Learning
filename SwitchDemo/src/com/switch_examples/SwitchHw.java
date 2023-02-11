package com.switch_examples;

import java.util.Scanner;

public class SwitchHw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------ Menu -------");
		System.out.println("Select : \n 1.Add \n 2.Sub \n 3.Mul \n 4.Div");
		String input = sc.next();
		System.out.println("----------------------------");

		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		switch (input) {
		case "Add":
			float add = num1 + num2;
			System.out.println("The addition of two number is : " + add);
			break;
		case "Sub":
			float sub = num1 - num2;
			System.out.println("The substraction of two number is : " + sub);
			break;
		case "Mul":
			float mul = num1 * num2;
			System.out.println("The multiplication of two number is : " + mul);
			break;
		case "Div":
			float div = num1 / num2;
			System.out.println("The division of two number is : " + div);
			break;

		default:
			System.out.println("Wrong input");
		}

	}

}
