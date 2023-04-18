package com.objectInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookObjectInputOutput {

	public static void readBook(File f1) {
		try {
			if (f1.exists()) {
				FileInputStream fin = new FileInputStream(f1);
				ObjectInputStream oin = new ObjectInputStream(fin);

				Book b1 = (Book) oin.readObject();
				System.out.println(b1);

				oin.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void addBook(File f1) {
		Book b = new Book(101, "Secret", 900f);

		try {
			if (!f1.exists()) {
				f1.createNewFile();
				FileOutputStream fout = new FileOutputStream(f1);
				ObjectOutputStream oout = new ObjectOutputStream(fout);

				oout.writeObject(b);
				oout.close();
				System.out.println("Book added");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		File f = new File("E:\\Java10Jan\\MyFiles\\BooksData.txt");

		addBook(f);
		readBook(f);
	}

}
