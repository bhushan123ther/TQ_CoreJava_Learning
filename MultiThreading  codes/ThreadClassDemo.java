package com.createThread;

// By extending thread class

public class ThreadClassDemo extends Thread {

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		ThreadClassDemo t1 = new ThreadClassDemo();
		t1.start();
	}
}
