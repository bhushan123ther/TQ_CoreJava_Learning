//3) final variable can not be re-initialized but final variable can be used to initialize other variables.

package com.finaldemo;

class Test3 {
	final int i = 30;

	void methodOne() {
		// i++; compile time error , final variable can not change.

		int j = i; // final variable can be used to initialize other

		System.out.println(i); // 30
	}

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.methodOne();
	}

}
