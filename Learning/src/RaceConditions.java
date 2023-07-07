class b extends Thread{
	public void show() throws InterruptedException {
		for(int i=0;i<100;i++) {
			System.out.println("hello");
			Thread.sleep(10);
		}
	}
}
class G extends Thread{
	public void show() throws InterruptedException {
		for(int i=0;i<100;i++) {
			System.out.println("hellooooooo");
			Thread.sleep(10);
		}
	}
}
public class RaceConditions {
/*
 *Mutation
 * thread Safe : only one thead can work at a same time
 */
	public static void main(String[] args) throws InterruptedException {
		b obj1=new b();
		G obj2=new G();
		obj1.show();
		obj2.show();
		obj1.join();// it is the method that ask the main thread to wait untill both the threads come and join the main thread
//		if multiple threads are working on the same method then we can make one thread to wait while exceution
//		it can be done by using a keyword named Synchronized in the main class
	}
}
