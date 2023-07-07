package CodingChallenge;

public class Challenge19 {
	static Challenge19 c;
	static {
		 c=new Challenge19();
		c.fun();
	}
public static void main(String[] args) {
//	creating object for a class and access instsnce method
	c.fun();
}
void fun() {
	System.out.println("fun");
}
}
