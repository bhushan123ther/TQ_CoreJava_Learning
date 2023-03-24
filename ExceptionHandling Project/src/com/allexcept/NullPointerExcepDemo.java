package com.allexcept;

class Demo {
	static String str;
}

public class NullPointerExcepDemo {

	public static void main(String[] args) {
		/*
		 * java.lang.NullPointerException NullPointerException is RunTimeException which
		 * is occurs when your application tries to access null object. It happens if
		 * you don't initialize the reference variable and it is pointing to null
		 * instead of actual object Using such reference variable will cause
		 * NullPointerException
		 */

		System.out.println(Demo.str.length());

	}

}

/*
 * In the above code, we are trying to find the length of string filed ‘s’ of
 * class A. But, it is not initialized. It is pointing to null. This will throw
 * java.lang.NullPointerException like below.
 */
