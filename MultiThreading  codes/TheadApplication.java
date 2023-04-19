package com.createThread;

public class TheadApplication extends Thread {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getName());
				Thread.sleep(400);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		TheadApplication t1 = new TheadApplication();
		t1.setName("MsWord");
		t1.setPriority(MAX_PRIORITY);

		TheadApplication t2 = new TheadApplication();
		t2.setName("chrome");
		t2.setPriority(MIN_PRIORITY);

		t1.start();
		t2.start();
	}

}
