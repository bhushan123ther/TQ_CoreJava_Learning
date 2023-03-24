package com.finaldemo;

//2) final method can be overloaded and that overloaded method can be overridden in the sub class.

class SuperClass {
	final void methodOne() {
		// final method
		System.out.println("I'm final method dude");
	}

	void methodOne(int num) {
		// final method can be overloaded
		System.out.println("Overloaded parameterized method");
	}
}

final class SubClass extends SuperClass {
	@Override
	final void methodOne(int num) {
		// Overloaded method can be overridden
		System.out.println("Overridden method..");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.methodOne(8);

		SuperClass obj2 = new SuperClass();
		obj2.methodOne(6);
	}

}
