class  MyException extends Exception {
	 
	private static final long serialVersionUID = 1L;
   public MyException(String s) {
	   super(s);
   }
	
}
public class ExceptionThrowKeyWord {
public static void main(String[] args) {
	int i=20;
	int j=0;
	try {
		int result=i/j;
		throw new MyException("DOn't make it");
	}
	catch (ArithmeticException | MyException E) {
		System.out.println("Something went wrong");
	}
}


}
