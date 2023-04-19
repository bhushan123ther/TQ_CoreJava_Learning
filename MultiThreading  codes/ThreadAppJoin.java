package com.createThread;

public class ThreadAppJoin implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getName());
				Thread.sleep(200);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		ThreadAppJoin t1 = new ThreadAppJoin();
		Thread t = new Thread(t1);
		t.setName("MsWord");
		t.setPriority(5);

		ThreadAppJoin t2 = new ThreadAppJoin();
		Thread tt = new Thread(t2);
		tt.setName("crome");
		tt.setPriority(1);

		t.start();
		tt.start();
	}

}
