package com.sleepdemo;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				// Thread.sleep(-1); //java.lang.IllegalArgumentException: timeout value is
				// negative
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		MyThread th = new MyThread();
		th.start();
	}

}
