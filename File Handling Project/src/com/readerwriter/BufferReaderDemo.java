package com.readerwriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a line : ");
			String name = br.readLine();

			System.out.println("Welcome " + name);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
// BuffereReader is used to read data from the console
