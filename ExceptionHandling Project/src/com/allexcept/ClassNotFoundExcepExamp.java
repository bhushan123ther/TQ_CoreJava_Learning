package com.allexcept;

public class ClassNotFoundExcepExamp {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*
 * ClassNotFoundException is a checked type of exception. It is thrown when an
 * application tries to load a class at run time using Class.forName() or
 * loadClass() or findSystemClass() methods, but the class with specified name
 * is not found in the classpath. This frequently occurs when you try to run
 * your application without updating the class path with required JAR files.
 */