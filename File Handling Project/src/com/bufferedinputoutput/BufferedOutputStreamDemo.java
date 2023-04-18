package com.bufferedinputoutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {

		String data = "I am learning Java at Think Quotient";

		try {
			File f = new File("E:\\Java10Jan\\MyFiles\\Output.txt");

			if (!f.exists()) {
				f.createNewFile();
				FileOutputStream fout = new FileOutputStream(f);
				BufferedOutputStream bout = new BufferedOutputStream(fout);

				byte[] array = data.getBytes();
				bout.write(array);
				bout.close();

				System.out.println("Data added....");
			} else {
				System.out.println("File already exists...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
