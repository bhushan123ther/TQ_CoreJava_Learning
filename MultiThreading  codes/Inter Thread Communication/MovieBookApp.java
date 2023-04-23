package com.interthreadcomm;

class TotalEarnings extends Thread {
	int total = 0;

	public void run() {

		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}
			this.notify();
		}
	}
}

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException {

		TotalEarnings te = new TotalEarnings();
		te.start();
		// System.out.println("Total Earnings : " + te.total + " Rs");

		synchronized (te) {
			te.wait();
			System.out.println("Total Earnings : " + te.total + " Rs");
		}
	}

}
