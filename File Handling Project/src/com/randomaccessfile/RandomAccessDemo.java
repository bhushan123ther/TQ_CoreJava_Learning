package com.randomaccessfile;

import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("E:\\Java10Jan\\MyFiles\\myfile.dat", "rw");
			raf.writeChar('s');
			raf.writeInt(15);
			raf.writeFloat(45.6f);

			System.out.println("Student added..");

			raf.seek(0);

			System.out.println(raf.readChar());
			System.out.println(raf.readInt());
			System.out.println(raf.readFloat());

			raf.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
