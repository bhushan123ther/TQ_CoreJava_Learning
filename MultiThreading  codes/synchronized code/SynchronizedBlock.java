package com.synchronization;

class Whatsapp {
	public void sendMessage(String msg) {
		System.out.println("Sending Message : " + msg);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println(msg + ":" + "received");
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {

		Whatsapp ws = new Whatsapp();

		Thread client1 = new Thread() {

			public void run() {
				synchronized (ws) {
					ws.sendMessage("Welcome");
				}
			}

		};

		Thread client2 = new Thread() {

			public void run() {
				synchronized (ws) {
					ws.sendMessage("Hello");
				}
			}

		};

		client1.start();
		client2.start();
	}

}
