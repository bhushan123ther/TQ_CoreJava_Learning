package com.createThread;

public class JoinMethod3 extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {

				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
				// Thread.currentThread().join();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		JoinMethod3 t1 = new JoinMethod3();
		JoinMethod3 t2 = new JoinMethod3();
		JoinMethod3 t3 = new JoinMethod3();

		t1.start();
		// t1.join(); // main will wait till t1 completes
		t2.start();
		t3.start();

	}

}
