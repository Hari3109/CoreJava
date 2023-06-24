package com.cg.Thread;

public class SynchronizationEx2 {
	public static void main(String[] args) throws InterruptedException {
		Banking bank=new Banking();
		Thread t1=new Thread(bank);
		Thread t2=new Thread(bank);
		t1.setName("GPay");
		t2.setName("Atm");
		t1.start();
		t2.start();
		//t1.start(); ->illegal thread exception 
		t1.join(); //non static method
		t2.join();
		System.out.println("Balance amt is "+bank.getBankBalance());
	}

}
class Banking implements Runnable{
	float bankBalance=5000;
	public void run() {
		debit(3000);
	}
	
	private synchronized void debit(float amt) {
		Thread t=Thread.currentThread();//static method-
		if(bankBalance>=amt && bankBalance>0) {
			System.out.println(t.getName()+" ready to debit");
			bankBalance-=amt;
			System.out.println(t.getName()+"Transaction success and balance is"+ bankBalance);
		}
		else {
			System.out.println(t.getName()+" insufficient balance");
		}
	}
	float getBankBalance() {
		return bankBalance;
	}
}