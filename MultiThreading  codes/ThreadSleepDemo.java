package com.createThread;

public class ThreadSleepDemo extends Thread {

	public ThreadSleepDemo() {

	}

	public ThreadSleepDemo(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		ThreadSleepDemo t1 = new ThreadSleepDemo("Welcom");
		ThreadSleepDemo t2 = new ThreadSleepDemo("Hello");

		t1.start();
		t2.start();
		// t1.start(); // we cannot call thread twice
		// java.lang.IllegalThreadStateException
	}

}
