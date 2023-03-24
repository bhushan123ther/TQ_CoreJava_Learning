// You can define your own exception also. These own defined exceptions are known as custom exceptions.
/* Note : 1. For writing custom checked exception, extend Exception class.
 *        2. For writing custom unchecked exception, extend RuntimeException class.*/

/*creating custom exceptions in Java can help you to provide more meaningful error messages, 
 * handle specific error conditions more effectively, 
 * improve code organization, and establish a consistent approach to error handling.*/

package com.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws InvaliedAgeException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();

		try {
			if (age < 0) {
				throw new InvaliedAgeException("The age must be greater than 0");
			}
		} catch (InvaliedAgeException e) {
			System.out.println(e);
		}
		System.out.println("Final code");

	}

}
