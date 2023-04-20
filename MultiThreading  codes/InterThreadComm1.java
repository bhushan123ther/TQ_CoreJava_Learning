package com.interthreadcomm;

class SharedR {
	public synchronized void methodOne() {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + " is releasing lock on methodOne");

		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(t.getName()+"has got the lock on Methodone and executing");
	}
	
	public synchronized void methodTwo() {
		
		Thread t= Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		notify();// wakes single thread
		
		System.out.println("Thread is being notified by :"+t.getName());
		
		
	}
	

}

public class InterThreadComm1 {

	public static void main(String[] args) {

     SharedR sh= new SharedR();
     
     Thread t1= new Thread()
    		 {
    	      public void run()
    	      {
    	    	  sh.methodOne();
    	      }
    	 
    		 };
    Thread t2= new Thread()
      		 {
      	      public void run()
      	      {
      	    	  sh.methodTwo();
      	      }
      	 
      		 }; 		 
     
     t1.start();
     t2.start();

	}

}
