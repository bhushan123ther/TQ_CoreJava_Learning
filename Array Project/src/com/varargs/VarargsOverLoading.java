package com.varargs;

public class VarargsOverLoading {
	public static void display(int... ar) {
		for (int i : ar) {
			System.out.println(i);
		}

	}

	public static void display(float... fl) {
		for (float i : fl) {
			System.out.println(i);
		}

	}

	public static void display(String... sr) {
		for (String i : sr) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		display(4, 5, 7, 8, 9);
		display(5.6f, 4, 7f, 23);
		display("Hello", "Java", "C");

	}

}
