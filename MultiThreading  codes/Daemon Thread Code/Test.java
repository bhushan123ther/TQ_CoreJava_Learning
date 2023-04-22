package com.damonthread;

public class Test extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		System.out.println("main thread");

		Test t = new Test();
		t.setDaemon(true);
		t.start();

		// t.setDaemon(true); // Exception in thread "main"
		// java.lang.IllegalThreadStateException
	}

}
