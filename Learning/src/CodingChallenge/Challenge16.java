package CodingChallenge;
class rain {
	public void fall() {
		
		System.out.println("tears");
	}
}
public class Challenge16 extends rain {
	 public Challenge16(){
		 super();
	 }
	public void fall() {
		super.fall();
		System.out.println("crying");
	}
public static void main(String[] args) {
//	super- it is a keyword it is pre-defined non static variable
//	it is used to access parent class functionality from child
	Challenge16 c=new Challenge16();
	c.fall();
}
}
