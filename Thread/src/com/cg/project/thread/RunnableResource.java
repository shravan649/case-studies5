package com.cg.project.thread;

public class RunnableResource implements Runnable{

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("thread-1")){
			for(int i =0 ;i<100;i++)
				if(t.getName().equals("thread-1")){
					if(i%2==0)
						System.out.println("even numbers:"+i);
				}
				else if(t.getName().equals("thread-2"))
					if(i%2!=0)
						System.out.println("odd numbers:"+i);
		}
	}
}
