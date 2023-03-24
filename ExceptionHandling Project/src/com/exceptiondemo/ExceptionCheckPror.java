package com.exceptiondemo;

public class ExceptionCheckPror {

	static void inputName() {
		String s = null;
		System.out.println(s.length());
	}

	static void checkName() {
		inputName();
	}

	static void acceptName() {
		try {
			checkName();
		} catch (Exception e) {
			System.out.println("String is null : checkName");
		}

	}

	public static void main(String[] args) {
		acceptName();
	}

}
