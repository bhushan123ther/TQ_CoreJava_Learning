package com.varargs;

public class OverridingVarargs {

	class Demo {
		void display(Integer... x) {
			for (int i : x) {
				System.out.println(i);
			}
		}
	}

	class Child extends Demo {
		void display(Integer... x) {
			for (int i : x) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

	}

}
