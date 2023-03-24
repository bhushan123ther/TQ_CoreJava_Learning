package com.allexcept;

class A {

}

class B extends A {

}

public class ClassCastExcepExample {

	public static void main(String[] args) {

		A obja = new A();
		B objb = (B) obja;

	}

}
/*
 * ClassCastException occurs when an object of one type can not be casted to
 * another type. While casting, an object must satisfy “IS-A” relationship. If
 * it doesn’t satisfy then JVM will throw java.lang.ClassCastException.
 */