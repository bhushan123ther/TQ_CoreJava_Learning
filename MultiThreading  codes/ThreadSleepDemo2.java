package com.createThread;

public class ThreadSleepDemo2 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		ThreadSleepDemo2 t1 = new ThreadSleepDemo2();
		ThreadSleepDemo2 t2 = new ThreadSleepDemo2();

		// return main as no separate call stack

		t1.run();
		t2.run();
	}

}
