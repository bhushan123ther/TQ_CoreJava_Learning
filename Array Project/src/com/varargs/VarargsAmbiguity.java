package com.varargs;

public class VarargsAmbiguity {

	public static void display(int x, char... ar) {
		System.out.println(x);
		for (char c : ar) {
			System.out.println(c);
		}
	}

	public static void display(char ch, int... ar) {
		System.out.println(ch);
		for (int c : ar) {
			System.out.println(c);
		}

	}

	public static void main(String[] args) {

		display(23, 'q', 's', 'f');
		display('h', 3, 4, 6, 2);

		// display(78,89,56,12);

	}

}
