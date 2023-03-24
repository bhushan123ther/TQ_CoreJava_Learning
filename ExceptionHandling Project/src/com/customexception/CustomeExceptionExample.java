/* Custom exception are those exception which are defined by your own .
 * Custom exceptions are used to handle specific error conditions that may occur
 * during the execution of a program. By creating custom exceptions, you can provide 
 * more meaningful and informative error messages to the users of your code, which can help
 * them diagnose and fix the problem more easily.*/

/*Benefits of creating custom exceptions in java : 
 * Improved error handling: By creating custom exceptions, you can handle specific error conditions in a more targeted way. This can help you to provide more accurate error messages and take appropriate action to handle the error.

   More informative error messages: Custom exceptions allow you to provide more detailed and informative error messages, which can help the user to understand the cause of the error and take appropriate action to resolve it.

   Better code organization: Custom exceptions allow you to separate error handling logic from the rest of your code, which can help to improve code organization and readability.

   Consistent error handling: By creating custom exceptions, you can establish a consistent approach to error handling across your codebase, which can help to ensure that errors are handled in a predictable and effective way.*/

package com.customexception;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

class Test {
	public void display() throws MyException {
		throw new MyException("This is custom exception.");
	}
}

public class CustomeExceptionExample {

	public static void main(String[] args) {
		// creating test object

		Test obj = new Test();

		try {
			obj.display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
