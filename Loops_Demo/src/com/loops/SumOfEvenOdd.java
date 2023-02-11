package com.loops;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		int sumEven, sumOdd;
		sumEven = sumOdd = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("Sum of Even number : " + sumEven);
		System.out.println("Sum of Odd number : " + sumOdd);
	}
}
