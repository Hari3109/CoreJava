package Test;

public class m {
public static void main(String[] args) {
	Task t=new Task();
	Thread thread =new Thread(t);
	//t.run();
	thread.start();
	//thread.start();
	System.out.println("main ");
}
}
class Task implements Runnable{
	public void run() {
		System.out.println("child");
	}
}