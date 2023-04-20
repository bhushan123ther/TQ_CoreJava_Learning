package com.threadapp;

class Table // resource
{
	void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				System.out.println(e);
			}
		}
	}

}

class MyThread1 extends Thread
{
	Table t;

	public MyThread1(Table t) {
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(10);
	}
	
	
	
}

class MyThread2 extends Thread
{
	Table t;

	public MyThread2(Table t) {
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(100);
	}
	
	
	
}
public class ThreadSynchronization1 {

	public static void main(String[] args) {

     Table t = new Table();
     MyThread1 t1= new MyThread1(t);
     MyThread2 t2= new MyThread2(t);
     
     t1.start();
     t2.start();

	}

}
