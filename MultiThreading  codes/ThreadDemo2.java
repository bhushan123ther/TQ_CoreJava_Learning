package com.createThread;

// Second way to create Thread by implementing Runnable interface

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

	public static void main(String[] args) {

		ThreadDemo2 td = new ThreadDemo2();

		Thread t = new Thread(td);

		t.start();

		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
