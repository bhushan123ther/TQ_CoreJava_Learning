package com.exceptiondemo;

public class NestedTry {
	public static void main(String[] args) {
		String arr[] = { "Java", "Python", null, "DevOps" };
		try {
			for (int i = 0; i < arr.length; i++) {
				try {
					System.out.println(arr[i].length());
				} catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
