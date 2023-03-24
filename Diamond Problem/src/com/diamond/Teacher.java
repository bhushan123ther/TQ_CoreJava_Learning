package com.diamond;

public interface Teacher {
	default void display() {
		System.out.println("I am Teacher");
	}
}
