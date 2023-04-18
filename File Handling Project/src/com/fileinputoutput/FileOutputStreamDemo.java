package com.fileinputoutput;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		String data = "I am learning Java at Think Quotient";
		try {
			File f = new File("E:\\Java10Jan\\MyFiles\\Output.txt");

			if (!f.exists()) {
				f.createNewFile();
				FileOutputStream fout = new FileOutputStream(f);

				byte[] array = data.getBytes();
				fout.write(array);
				fout.close();

				System.out.println("Data added...");
			} else {
				System.out.println("File already exists....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
