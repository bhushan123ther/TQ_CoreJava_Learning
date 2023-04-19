package com.createThread;

public class JoinMethod2 extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethod2 t1 = new JoinMethod2();
		JoinMethod2 t2 = new JoinMethod2();
		JoinMethod2 t3 = new JoinMethod2();

		t1.start();
		t1.join();
		t2.start();
		t3.start();

	}

}
