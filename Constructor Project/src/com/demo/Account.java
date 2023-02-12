package com.demo;

/*1. Create a class Account with member Variable: long accountNo, String customerName.
Make them public.
*/

public class Account {
	long accountNo;
	String customerName;

	/*
	 * 3. Create default constructor assign new value to all variables. Write SOP I
	 * am in default constructor
	 */

	Account() {
		System.out.println("I'm in default constructor..");
		this.accountNo = 101;
		this.customerName = "Rohit";
	}

	/*
	 * 5. Define a constructor which takes all arguments and assigns those values to
	 * the member variables. SOP I am in parameterized constructor
	 */
	public Account(long accountNo, String name) {
		System.out.println("I am in parameterized constructor");
		this.accountNo = accountNo;
		this.customerName = name;
	}

	public void displayInfo() {
		System.out.println(accountNo + " " + customerName);
	}

	public static void main(String[] args) {

		/*
		 * 2. In main, create a new object of the Account class and print the member
		 * variables value. Note – Default constructor is provided by Java to facilitate
		 * the creation of a new object. Here variables are assigned default values
		 */

		Account ac1 = new Account();
		ac1.displayInfo();

		System.out.println("==============================");

		/*
		 * 4. In main, create another object of the Account class and print the member
		 * variables value. Note – Since you have defined a (default) constructor, Java
		 * does not provide another one.
		 */

		Account ac2 = new Account();
		ac2.displayInfo();

		System.out.println("==============================");

		/*
		 * 6. In main, to create another object of the Account class using the
		 * constructor with all arguments and print the member variable values.
		 */

		Account ac3 = new Account(123234, "Ruhi");

		/*
		 * 7. In main method, create 2 Account objects with different account numbers
		 * and names. Then print the values of all the member variables of both the
		 * accounts.
		 */

		Account ac4 = new Account(111222, "Anand");
		Account ac5 = new Account(333444, "Ravi");
		ac4.displayInfo();

		System.out.println("==============================");

		ac5.displayInfo();
	}
}
