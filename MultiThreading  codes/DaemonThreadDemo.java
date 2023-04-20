package com.threadapp;

public class DaemonThreadDemo extends Thread {
	
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

      DaemonThreadDemo t1= new DaemonThreadDemo();
      DaemonThreadDemo t2= new DaemonThreadDemo();
      DaemonThreadDemo t3= new DaemonThreadDemo();
      
      t2.setDaemon(true);
      
      t2.start();
      t1.start();
      t3.start();
      

	}

}
