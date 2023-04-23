package com.interthreadcomm;

class Account {
	int amount = 10000;

	public synchronized void withdraw(int amount) {
		System.out.println("Goint to withdraw : " + amount);
		if ((this.amount - amount) < 1000) {
			System.out.println("Less balance : " + this.amount + " :  waiting for deposit");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Withdraw successfull : " + amount);
		System.out.println("Balance : " + this.amount);
	}

	public synchronized void deposite(int amount) {
		System.out.println("Going to deposite : " + amount);
		this.amount += amount;

		System.out.println("Deposited amount : " + amount);
		System.out.println("Balance : " + this.amount);
		notify();
	}
}

public class InterTheadComm2 {

	public static void main(String[] args) {

		Account a = new Account();

		Thread t1 = new Thread() {
			public void run() {
				a.withdraw(20000);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				a.deposite(150000);
			}
		};

		t1.start();
		t2.start();
	}
}
