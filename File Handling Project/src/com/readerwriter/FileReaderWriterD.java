package com.readerwriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterD {

	public static void readerData(File file) {
		try {
			FileReader fr = new FileReader(file);
			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void writerData(File file) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("I love Java Codes specially nested loops");
			fw.close();
			System.out.println("Data added..");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		File f = new File("E:\\Java10Jan\\MyFiles\\ReaderDemo.txt");
		writerData(f);
		readerData(f);

	}

}
