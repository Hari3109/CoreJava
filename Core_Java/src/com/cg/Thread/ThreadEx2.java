package com.cg.Thread;

public class ThreadEx2 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t.getName()+  " main thread started running....");
	MyTask1 task=new MyTask1();
	Thread t1=new Thread(task);//NEW state
	t1.start();//Runnable state,Not Running...
	//can't predict...
	for(int i=0;i<20;i++) {
		System.out.println("Main :"+i);
	}
	System.out.println("Main thread ends...");
}
}
class MyTask1 implements Runnable{
	//this run method is called automatically
	//when the child thread started running
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+ " Child thread started running.....");
	
	for(int i=0;i<20;i++) {
		System.out.println("Child :"+i);
	}
}
}