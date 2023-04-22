package com.joinexamples;

class Medical extends Thread {
	public void run() {
		try {
			System.out.println("Medical status");
			Thread.sleep(3000);
			System.out.println("Medical completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class TestDriver extends Thread {
	public void run() {
		try {
			System.out.println("Test drive starts");
			Thread.sleep(5000);
			System.out.println("Test drive completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer takes the file..");
			Thread.sleep(3000);
			System.out.println("Officer work completed..");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenceDemo {

	public static void main(String[] args) throws InterruptedException {

		Medical medical = new Medical();
		medical.start();

		medical.join();

		TestDriver td = new TestDriver();
		td.start();

		td.join();

		OfficerSign os = new OfficerSign();
		os.start();

	}

}
