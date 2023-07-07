class hi extends Thread{
	public void Greet() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class di extends Thread{
	public void lost() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class threads {
//	concept came into exsistance by the idea of muiltitasking
//	the smallest unit or task which we can work with
//	we can work with multiple threads at a time
	public static void main(String[] args) {
		hi g=new hi();
		di k=new di();
		g.Greet();
		k.lost();
//  if we want both the threads exceuted simulteniously we need the concept of thread then we need to create obj as thread
//		System.out.println(Thread.MAX_PRIORITY);
//		g.start();
//		
//		k.start();
//	schedular decides which thread to ivoke first
//		start method belongs to the class thread
//		we can also implement the runnable class instead if thread then we have create a obj of thread and we have to implement start method to that start method
//		Thread t1=new Thread(g);
//		t1.start();
		
	}

}
