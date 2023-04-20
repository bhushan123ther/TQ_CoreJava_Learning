package com.threadapp;

public class DaemonThreadDemo2 extends Thread {
	
	public void run()
	{
		try {
			
			
			
			if(Thread.currentThread().isDaemon())
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				System.out.println("Daemon thread");
				System.out.println("--------------------------------");
			}
			else
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				System.out.println("User thread");
				System.out.println("--------------------------------");
				
			}
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

      DaemonThreadDemo2 t1= new DaemonThreadDemo2();
      DaemonThreadDemo2 t2= new DaemonThreadDemo2();
      DaemonThreadDemo2 t3= new DaemonThreadDemo2();
      
     
      t2.start();
      
     // t2.setDaemon(true); // throws exception Illegal thread State
      
      t1.start();
      t3.setDaemon(true);
      t3.start();
      

	}

}
