package com.threadapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
	private String taskName;

	public MyTask(String taskName) {

		this.taskName = taskName;
	}

	@Override
	public void run() {

		try {

			for (int i = 0; i < 5; i++) {
				if (i == 0) {
					Date d = new Date();
					SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Intialized task:" + taskName + "  " + sf.format(d));

				}

				else {
					Date d = new Date();
					SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Exceuting task :" + taskName + "  " + sf.format(d));

				}

				Thread.sleep(1000);

			}
			System.out.println("Task complete:" + taskName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {

    // creating 3 task
		
		Runnable r1= new MyTask("Play Music");
		Runnable r2= new MyTask("Score Points");
		Runnable r3= new MyTask("Move Car");
		Runnable r4= new MyTask("Increase Speed");
		Runnable r5= new MyTask("Apply brakes");
		
		ExecutorService ex= Executors.newFixedThreadPool(3);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		ex.execute(r5);
		
		ex.shutdown();
			
		
		

	}

}
