package com.tns.threading;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Person p=new Person(); p.setId(101); p.setName("Aniket");
		 * 
		 * ChildThread t1=new ChildThread(p); ChildThread t2=new ChildThread(p);
		 */
		
		Account account =new Account();
		account.setId(101);
		account.setName("Amit");
		account.setBalance(50000);
		System.out.println(Thread.currentThread());
		AccountThread t1=new AccountThread(account, 12000);
		AccountThread t2=new AccountThread(account, 27000);
		AccountThread t3=new AccountThread(account, 20000);
		AccountThread t4=new AccountThread(account, 10000);
		AccountThread t5=new AccountThread(account, 5000);
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(account);
	}

}
