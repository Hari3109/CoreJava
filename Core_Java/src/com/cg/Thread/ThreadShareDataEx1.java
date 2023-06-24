package com.cg.Thread;

public class ThreadShareDataEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread");
		MyTask2 task=new MyTask2();
		Thread t=new Thread(task);
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		t.start();
		t1.start();
		t2.start();
		//Thread.sleep(20);
		t.join();
		t1.join();
		t2.join();
		//here main thread goes to blocked state until the child finishes the task
		//here in main i want the computation result
		System.out.println("Counter val: "+task.getCounter());
		System.out.println("Main Ends....");
	}

}
class MyTask2 implements Runnable{
	int counter=0;
	public void run() {
		System.out.println("child thread started");
		for(int i=0;i<4;i++) {
			synchronized(this) {
				//it allows only one key 
			
			//System.out.println("counting");
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			counter++;
			}
		}
		System.out.println("child thread end");
	}
	int getCounter() {
		return counter;
		
	}
}