package com.allexcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Bablad\\Desktop\\Open.txt";

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
 * IOException occurs when an IO operation fails in your application.
 * IOException is a checked type of exception. This exception is the super class
 * for all type of IO exceptions. Some of the popular IO exceptions are
 * FileNotFoundException, SocketException, SSLException etc.
 */