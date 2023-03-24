package com.allexcept;

public class ArrayIndexOutOfBoundExamp {

	public static void main(String[] args) {

		String names[] = { "Bhushan", "Aisha", "Anand", "Neha", "Rutuki", "Dhreya", "Mina" };

		System.out.println(names[7]);

		System.out.println(names[-1]);

	}

}

/*
 * ArrayIndexOutOfBoundsException is also one of the frequently occurring
 * exception in java. It occurs when you try to access an array element with an
 * invalid index. i.e index greater than the array length or with a negative
 * index.
 */

/*
 * In above example, string array names contains only 7 elements . But, we are
 * trying to access eight element. This will result in
 * java.lang.ArrayIndexOutOfBoundsException
 */
