package com.fileinputoutput;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		try {
			File f = new File("E:\\Java10Jan\\MyFiles\\Output.txt");

			if (f.exists()) {
				FileInputStream fin = new FileInputStream(f);

				int i = 0;

				while ((i = fin.read()) != -1) {
					System.out.print((char) i);
				}
				fin.close();
				System.out.println();

				System.out.println("File complete......");
			} else {
				System.out.println("File does not exists....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
