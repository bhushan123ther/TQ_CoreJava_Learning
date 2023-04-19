package com.createThread;

public class ThreadInterruptDemo2 extends Thread {

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

	public static void main(String[] args) throws InterruptedException {
		ThreadInterruptDemo2 t1 = new ThreadInterruptDemo2();
		t1.start();

		ThreadInterruptDemo2 t2 = new ThreadInterruptDemo2();
		t2.start();

		// main thread
		try {
			t1.join(); // main waits till t1 is complete

			System.out.println(Thread.currentThread().getName());
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println(e);
		}

		t2.interrupt();

	}
}
