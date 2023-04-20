package com.interthreadcomm;

class Account
{
  int amount= 10000;
  
 public synchronized void withdraw(int amount)
 {
	 System.out.println("going to withdraw:"+amount);
	 if((this.amount-amount)<100)
	 {
		 System.out.println("Less balance:"+this.amount+"  : waiting for deposit");
		 try {
			 wait();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	 }
	 this.amount= this.amount-amount;
	 System.out.println("Withdraw successfull:"+amount);
	 System.out.println("Balance:"+this.amount);

 }
 
 public synchronized void deposit(int amount)
 {
	 System.out.println("going to deposit:"+amount);
	 this.amount+=amount;
	 
	 System.out.println("Deposited amount:"+amount);
	 System.out.println("Balance:"+this.amount);
	 notify();
	 
 }
   
}

public class InterThreadComm2 {

	public static void main(String[] args) {

      Account a= new Account();
      
      Thread t1= new Thread()
    		  {
    	       public void run()
    	       {
    	    	   a.withdraw(20000);
    	       }
    	      	  
    		  };
    		  
     Thread t2= new Thread()
    		  {
    	       public void run()
    	       {
    	    	   a.deposit(15000);
    	       }
    	      	  
    		  };	
    		  
    t1.start();
    t2.start();
      

	}

}
