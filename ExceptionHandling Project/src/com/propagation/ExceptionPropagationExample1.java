// Exception propagation is a way of propagting exception from method to method.
// Let an exception occur in a method at the top of the call stack and if it is not caught then it propagates to previous method in the call stack,
// if it is not caught here then it again propagates to previous method in the call stack and so on until either it is caught or reach the bottom of the stack.

//Exception propagation in case of unchecked exception.

/* Inside the method if an exception raised and if we are not able to handle that exception now exception will be propagate in caller method , caller method is
 * is responsible to handle that exception this is called propagation. */

package com.propagation;

class ArithmeticTest {
	public void division(int num1, int num2) {
		// java.lang.ArithmeticException here
		// and not caught hence propage to method1.
		System.out.println(num1 / num2);
	}

	public void method1(int num1, int num2) {
		// not caught here and hence propagate to method2
		division(num1, num2);
	}

	public void method2(int num1, int num2) {
		try {
			method1(num1, num2);
		} catch (Exception e) {
			// Exception caught here
			System.out.println("Exception Handled");
		}
	}
}

public class ExceptionPropagationExample1 {

	public static void main(String[] args) {

		// creating ArithmeticTest object
		ArithmeticTest obj = new ArithmeticTest();
		obj.method2(100, 0);
	}

}
