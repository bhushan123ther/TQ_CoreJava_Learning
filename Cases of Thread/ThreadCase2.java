package com.threadcases;
// Performing single task from multiple Thread

public class ThreadCase2 extends Thread {

	public void run() {
		System.out.println("single thread task");
	}

	public static void main(String[] args) {

		ThreadCase2 th1 = new ThreadCase2();
		th1.start();

		ThreadCase2 th2 = new ThreadCase2();
		th2.start();
	}

}
