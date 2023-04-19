package com.createThread;

public class JoinDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {
				try {
					// t3.join(300); can not be done here
					for (int i = 1; i <= 10; i++)
						System.out.println(i);

					System.out.println("1 to 10 printed");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				try {
					t1.join(300); // t2 waits till t1 is completed
					for (int i = 11; i <= 20; i++)
						System.out.println(i);

					System.out.println("11 to 20 printed");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		Thread t3 = new Thread() {

			public void run() {
				try {
					t2.join(300); // t3 waits till t2 is completed
					for (int i = 21; i <= 30; i++)
						System.out.println(i);

					System.out.println("21 to 30 printed");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}
}
