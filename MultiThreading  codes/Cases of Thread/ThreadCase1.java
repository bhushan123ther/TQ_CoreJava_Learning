package com.threadcases;

// Performing single task from single Thread

public class ThreadCase1 extends Thread {

	public void run() {
		System.out.println("Thread task");
	}

	public static void main(String[] args) {

		ThreadCase1 th = new ThreadCase1();
		th.start();
	}

}
