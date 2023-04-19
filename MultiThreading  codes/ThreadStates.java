package com.createThread;

public class ThreadStates {

	public static void main(String[] args) {

		// To know all states of thread

		Thread.State[] states = Thread.State.values();

		for (Thread.State s : states) {
			System.out.println(s);
		}
	}
}
