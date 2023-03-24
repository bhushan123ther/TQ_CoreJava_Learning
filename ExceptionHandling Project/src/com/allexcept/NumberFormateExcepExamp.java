package com.allexcept;

public class NumberFormateExcepExamp {

	public static void main(String[] args) {

		int i = Integer.parseInt("Bhushan");

	}

}

/*
 * NumberFormatException is thrown when you are trying to convert a string to
 * numeric value like integer, float, double etc..., but input string is not a
 * valid number. NumberFormatException is also one of IllegalArgumentException.
 */

/*
 * In the above code, we are trying to convert a string “abc” to number, which
 * is not possible. This will throw java.lang.NumberFormatException.
 */