/* Normally, catch block are used to handle the exceptions raised in the try block. The exception 
 * can re-throw using throw keyword, if catch block is unable to handle it. This process is called 
 * re-throwing exception*/

package com.rethrowing;

public class RethrowException {

	public static void print(String st) throws LengthException {
		if (st.length() < 3) {
			throw new LengthException("Length should be greater than 3");
		}
	}

	public static void printLength(String st) throws LengthException {
		try {
			print(st);
		} catch (Exception e) {
			System.out.println("Inside printLength");
			throw e;
		}
	}

	public static void main(String[] args) {

		try {
			String s = "J a";
			printLength(s);
		} catch (Exception e) {
			System.out.println("Caught in main");
			System.out.println(e);
		}
	}

}
