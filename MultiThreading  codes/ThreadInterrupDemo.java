package com.createThread;

public class ThreadInterrupDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				if (Thread.interrupted()) {
					System.out.println(Thread.currentThread().getName() + " : Interrupt " + i);
				} else {
					System.out.println(Thread.currentThread().getName() + " : Normal " + i);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		ThreadInterrupDemo t1 = new ThreadInterrupDemo();
		t1.start();
		// main method
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(300);
		} catch (Exception e) {
			System.out.println(e);
		}

		t1.interrupt();
	}

}
