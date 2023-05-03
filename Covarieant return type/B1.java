package com.classes_objects;

class A {
	A get() {
		System.out.println("Hey I'm A class method");
		return this;
	}
}

public class B1 extends A {

	B1 get() {
		super.get();
		System.out.println("Hey I'm B class method");
		return this;
	}

	void message() {
		System.out.println("Welcome to covariant return type");
	}

	public static void main(String[] args) {

		// new B1().get().message();
		B1 obj = new B1();
		obj.get();
		obj.message();
	}

}
