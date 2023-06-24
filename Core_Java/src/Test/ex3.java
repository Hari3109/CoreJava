package Test;



public class ex3{
	public static void main(String[] args) {
		try {
			float x=5;
			float y=0;
			System.out.println(x/y);
			System.out.println("try end");
		}catch(Exception e){
			System.out.println("main catch");
			
		}
		System.out.println("main end");
	}
}
