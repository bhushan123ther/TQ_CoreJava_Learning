package com.createThread;

// First way to create Thread using extending Thread

public class ThreadDemo1 extends Thread {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thead");
		}
		// This part will be executed by child thread
	}

	public static void main(String[] args) {

		ThreadDemo1 t1 = new ThreadDemo1(); // initializing thread
		t1.start(); // starts of a thread

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		// This part will be executed by main thread
	}
}

// Multi threading output will not able to guess because it's mixed

// Thread-scheduler : Thread-scheduler is responsible to schedule our thread
// Thread-scheduler is part of JVM
// In which position threads are executed it is decided by JVM