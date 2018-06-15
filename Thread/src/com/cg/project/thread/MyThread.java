package com.cg.project.thread;
public class MyThread extends Thread {
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	public void run(){
		if(this.getName().equals("thread-1"))
			for(int i =0 ;i<100;i++)
				if(this.getName().equals("thread-1")){
					if(i%2==0)
						System.out.println("even numbers:"+i);
				}
				else if(this.getName().equals("thread-2"))
					if(i%2!=0)
						System.out.println("odd numbers:"+i);
	}
}