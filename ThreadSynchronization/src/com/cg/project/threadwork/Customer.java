package com.cg.project.threadwork;
import com.cg.project.beans.Account;
public class Customer implements Runnable {
	public Customer(){}
	private static Account account;
	static{
		account=new Account(10000);
		System.out.println("Initial Balance -"+account.getBalance()+ "\n\n=========");
	}
	@Override
	public void run() {		
		Thread customer=Thread.currentThread();
		if(customer.getName().equals("s")) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
					System.out.println("\n s has call withdraw() "+i
							+" time balance :="+account.withdraw(3000));
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(customer.getName().equals("r")) {
			for(int i=1;i<=10;i++) {
				try {                                                                    
					Thread.sleep(1000);
					System.out.println("\n r has call deposit() "+i
							+" time balance :="+account.deposit(2000));
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		if(customer.getName().equals("m")) {
			for(int i=1;i<=3;i++) {
				try {
					Thread.sleep(1000);
					System.out.println("\n m has call checkBalance() "+i
							+" time balance :="+account.getBalance());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}