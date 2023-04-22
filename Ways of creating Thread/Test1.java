package com.waysofcreatingthread;

public class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread task 2");
	}

	public static void main(String[] args) {

		Test1 t = new Test1();
		Thread th = new Thread(t);
		th.start();

	}

}
