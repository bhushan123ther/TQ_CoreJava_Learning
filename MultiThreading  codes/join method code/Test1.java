package com.joinexamples;

public class Test1 extends Thread {

	static Thread mainthread;

	public void run() {

		try {

			mainthread.join(); // child method waits till main tread executed.

			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		mainthread = Thread.currentThread();
		Test1 t1 = new Test1();

		t1.start();
		// t1.join(); // main method waits till child thread is executed.

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
