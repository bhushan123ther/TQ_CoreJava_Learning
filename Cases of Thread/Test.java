package com.threadcases;

// Performing single task from multiple Thread

public class Test extends Thread {

	public void run() {
		System.out.println("task 1");
	}

	public static void main(String[] args) {

		ThreadCase1 thread1 = new ThreadCase1();
		thread1.start();

		ThreadCase1 thread2 = new ThreadCase1();
		thread2.start();

		ThreadCase1 thread3 = new ThreadCase1();
		thread3.start();

	}

}
