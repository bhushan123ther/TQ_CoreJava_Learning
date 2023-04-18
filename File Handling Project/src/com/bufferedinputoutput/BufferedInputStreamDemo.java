package com.bufferedinputoutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try {
			File f = new File("E:\\Java10Jan\\MyFiles\\Output.txt");

			if (f.exists()) {
				FileInputStream fin = new FileInputStream(f);
				BufferedInputStream bin = new BufferedInputStream(fin);

				int i = 0;

				while ((i = bin.read()) != -1) {
					System.out.print((char) i);
				}
				bin.close();
				System.out.println();

				System.out.println("File completed...");
			} else {
				System.out.println("File does not exists..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
