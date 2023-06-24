package com.cg.Thread;

public class MainThreadEx1 {
public static void main(String[] args) {
	//System.out.println(5/0);
	Thread t=Thread.currentThread();//returns current running thread referance
	System.out.println("Current running thread is "+t.getName());
	t.setName("CG");
	System.out.println("updated thread name is "+t.getName());
	System.out.println("Priority is "+t.getPriority());
	//min priority is1,normal priority is 5,max priority of thread is 10
	t.setPriority(Thread.MAX_PRIORITY);
	System.out.println("updated  priority is "+t.getPriority());
	t.setPriority(9);
	System.out.println("updated  priority is "+t.getPriority());
	t.setPriority(1);
	System.out.println("updated  priority is "+t.getPriority());//exception occured
	//it doesn't shows exception to handle
	//if it has to handle means here itself throws error
	//so its is unchecked exception
	//System.out.println(t.toString());
	System.out.println(t);//invoke toString directly
	for(int i=1;i<10;i++) {
		System.out.println(i);
		try {
			Thread.sleep(i);//makes the current running thread to block for a sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
}
