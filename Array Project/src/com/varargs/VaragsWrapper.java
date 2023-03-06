package com.varargs;

public class VaragsWrapper {
	public static void display(Object... x) {
		/*
		 * System.out.println("Object"); for(Object c:x) { System.out.println(c); } void
		 * display(Integer ...x) { for(int i:x) { System.out.println(i); } }
		 */
	}

	public static void display(Number... x) {
		System.out.println("Number");
		for (Number c : x) {
			System.out.println(c);
		}
	}

	public static void display(Character... x) {
		System.out.println("Character");
		for (char ch : x) {
			System.out.println(ch);
		}

	}

	public static void main(String[] args) {

	}

}
