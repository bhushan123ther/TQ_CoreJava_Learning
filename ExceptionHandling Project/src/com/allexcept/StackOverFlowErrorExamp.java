package com.allexcept;

public class StackOverFlowErrorExamp {

	static void methodOne() {
		methodTwo();
	}

	static void methodTwo() {
		methodOne();
	}

	public static void main(String[] args) {

		methodOne();

	}

}
/*
 * StackOverflowError is a run time error which occurs when stack overflows.
 * This happens when you keep calling the methods recursively.
 */