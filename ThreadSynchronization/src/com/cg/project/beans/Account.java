package com.cg.project.beans;
public class Account {
	private static int SUCCESS,FAIL=0;
	private int balance;
	public Account(){}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*public int deposit(int amount) {
	synchronized (this) {
		balance=balance+amount;
		return balance;
	}
	}*/
	public synchronized int deposit(int amount) {
		balance=balance+amount;
		this.notify();
		//this.notifyAll();
		return balance;
	}

	/*public int withdraw(int amount) {
	synchronized (this) {
	balance=balance-amount;
	return balance;
	}
}*/

	public synchronized int withdraw(int amount) throws InterruptedException {
		if(balance<0||(getBalance()-amount)<0) {
			FAIL++;
			System.out.println("\n\t\tWithdraw Fail "+FAIL);
			this.wait(5000);
			return balance;
		}
		else {
			balance=balance-amount;
			SUCCESS++;
			System.out.println("\n\t\tWithdraw Success "+SUCCESS);
			return balance;
		}
	}
}