package com.threadapp;

class MyTable // resource
{
  synchronized void printTable(int n) {
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

class Thread1 extends Thread
{
	MyTable t;

	public Thread1(MyTable t) {
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(10);
	}
	
	
	
}

class Thread2 extends Thread
{
	MyTable t;

	public Thread2(MyTable t) {
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(100);
	}
	
	
	
}
public class ThreadSynchronization2 {

	public static void main(String[] args) {

     MyTable t = new MyTable();
     Thread1 t1= new Thread1(t);
     Thread2 t2= new Thread2(t);
     
     t1.start();
     t2.start();

	}

}
