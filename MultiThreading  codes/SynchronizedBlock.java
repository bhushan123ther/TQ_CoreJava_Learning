package com.threadapp;

class Whatsapp
{
	public void sendMessage(String msg)
	{
		System.out.println("Sending Message:"+msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(msg+" :"+"received");
	}
}



public class SynchronizedBlock {

	public static void main(String[] args) {
		
		Whatsapp ws= new Whatsapp();
		
		Thread client1= new Thread()
				{
			    public void run()
			    {
			    	synchronized(ws)
			    	{
			    	ws.sendMessage("Welcome");
			    	}
			    	
			    	System.out.println("Java is programming language");
			    }
			
				};
				
	    Thread client2= new Thread()
				{
			    public void run()
			    {
			    	synchronized (ws) {
			    		ws.sendMessage("Hello");
					}
			    	
			    	System.out.println("Hello Rupali");
			    	
			    }
			
				};		
		
		client1.start();
		client2.start();

	}

}
