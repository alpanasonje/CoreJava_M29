package com.tns.threading;

public class AccountThread extends Thread{
	Account acc;
	int amount;
	public AccountThread(Account acc, int amount)
	{
		this.acc=acc;
		this.amount =amount;
		start();
	}
	public void run()
	{
	//	synchronized(acc)
		//{
			System.out.println(Thread.currentThread());
			acc.withdraw(amount);
		//}
	}

}
