package com.throwsdemo;

public class ThrowsDemo2 {
	static void inputName() throws NullPointerException {
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {

		try {
			inputName();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
