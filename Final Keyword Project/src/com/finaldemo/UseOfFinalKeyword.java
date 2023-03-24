package com.finaldemo;

//4) When an array reference variable is declared as final, only variable itself is final but not the array elements.

public class UseOfFinalKeyword {

	public static void main(String[] args) {

		final int x[] = new int[10];

		x[2] = 10;
		x[2] = 20; // array element can be re-assigned

		// x = new int[30]; compile time error
		// can't re-assign new array object to final array variable

		System.out.println(x[2]);
	}

}
