
public class Exceptions {
//types of errors
//	1:Compile time error
//	2: Run time error -these runtime errors are generally called as exception 
//	generally runtime errors prevent the code to execute
//	so we have to handle the exceptions
//	3: logical error
//	handling Exception takes place by using try Catch block
	public static void main(String[] args) throws Exception {
		try {
		int j=8/0;
		}
		catch(ArithmeticException A ) {
			System.out.println("can't resolve");
		}
		catch(Exception E){
			System.out.println("invalid" + E);
		}
		System.out.println("Executed perfectly fine");
//		Exception is the parent class of the other exceptions
//		throwable is the parent class of exception
//		when u are handling many exceptions in a class make sure that the Exception class must be handle at the bottom of the class
//		finally is used to close the data
		
	}
}
