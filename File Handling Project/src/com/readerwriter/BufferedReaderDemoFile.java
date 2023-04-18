package com.readerwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderDemoFile {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("E:\\Java10Jan\\MyFiles\\BuffReader.txt");

			System.out.println("Enter the data (enter stop if you finish) : ");

			String data = "";
			while (!data.equalsIgnoreCase("stop")) {
				data = br.readLine();
				fw.write(data);
				fw.write("\n");
			}

			br.close();
			fw.close();

			BufferedReader reader = new BufferedReader(new FileReader("E:\\Java10Jan\\MyFiles\\BuffReader.txt"));

			System.out.println("==========================================");

			int ch;

			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
