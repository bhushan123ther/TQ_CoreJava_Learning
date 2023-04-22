package com.threadcases;

// Performing multiple task from multiple threads

class Music extends Thread {
	public void run() {
		System.out.println("Playing music");
	}
}

class ProgressBar extends Thread {
	public void run() {
		System.out.println("Progress bar");
	}
}

class TimerProgressBar extends Thread {
	public void run() {
		System.out.println("Timer running");
	}
}

class ThreadCase3 {

	public static void main(String[] args) {

		Music th1 = new Music();
		th1.start();

		ProgressBar th2 = new ProgressBar();
		th2.start();

		TimerProgressBar th3 = new TimerProgressBar();
		th3.start();
	}

}
