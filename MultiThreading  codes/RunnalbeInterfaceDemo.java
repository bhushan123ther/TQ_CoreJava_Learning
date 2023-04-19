package com.createThread;

// By implementing Runnable interface

public class RunnalbeInterfaceDemo implements Runnable {

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		RunnalbeInterfaceDemo ri = new RunnalbeInterfaceDemo();
		Thread t1 = new Thread(ri, "Mythread");
		t1.start();
	}
}
