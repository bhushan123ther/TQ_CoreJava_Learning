/* when you are keeping multiple catch blocks, the order of catch blocks must be from most specific to 
 * most general ones. i.e  Sub classes of exception must come first and super classes later. If you keep super
 * classes first and sub classes later, compiler will show unreachable catch block error.*/

package com.unreachable_exception;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int i = Integer.parseInt("abc");
		} catch (Exception e) {
			// This statement throws NumberFormatException
			System.out.println("This block handles all exceptins types.");
		}
		/*
		 * catch (NumberFormatException ex) { // compile time error // This block
		 * becomes unreachable as exception is already caught by above catch // block }
		 */
	}

}
