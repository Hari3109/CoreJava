package CodingChallenge;

public class Challenge2 {
   //constructorChanining:connecting constructor of either a single class or in inheritance
//	this():calling constructor of same class
//while calling this(),we can pass parameters.	
//	this(10);
//	call to this() method must be the first statement in the contructor 
	public Challenge2() {
		super();
		System.out.println("hi");
	}
	public Challenge2(int x) {
		this();
		System.out.println("hello");
	}
	public Challenge2(int x, int y) {
		this(9);
		System.out.println("bye");
	}
	public static void main(String[] args) {
		Challenge2 c=new Challenge2(3,6);
		
	}
}
