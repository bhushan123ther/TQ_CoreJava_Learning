package com.waysofcreatingthread;

public class Test extends Thread {
	public void run() {
		System.out.println("Thead task");
	}

	public static void main(String[] args) {

		Test t = new Test();

		t.start();
		// t.run(); // It is simple method not thread
	}

}
