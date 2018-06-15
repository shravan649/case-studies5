package com.cg.project.main;

//import com.cg.project.thread.MyThread;
import com.cg.project.thread.RunnableResource;

public class MainClass {

	public static void main(String[] args) {
		RunnableResource resource =new RunnableResource(); 
			Thread th1 =new Thread(resource, "thread-0");
			Thread th2 =new Thread(resource, "thread-1");
			th1.start();
			th2.start();
		
	}		
}







	/*		MyThread th1=new MyThread("thread-1");
		MyThread th2=new MyThread("thread-2");
		th1.start();
		th2.start();
	}
}*/