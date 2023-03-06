package com.varargs;

public class RulesVarags {

	/*
	 * public static void display(int ...a, int ...b) { //Rule 1: there can be only
	 * one varargs. }
	 */

	public static void display(int b, int... a) {
		System.out.println("b : " + b);
		for (int i : a) {
			System.out.println(i);
		}
	}
	// Rule 2 : Varargs has to be last argument

	public static void main(String[] args) {

		display(8, 3, 45, 5, 6);
	}

}
