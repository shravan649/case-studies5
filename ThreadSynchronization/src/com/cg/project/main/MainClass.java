package com.cg.project.main;
import com.cg.project.threadwork.Customer;
public class MainClass {
	public static void main(String[] args) {
		Thread th1 =new Thread(new Customer(),"s");
		Thread th2 =new Thread(new Customer(),"r");
		Thread th3 =new Thread(new Customer(),"m");
		th1.start();
		th2.start();
		th3.start();		
	}	
}