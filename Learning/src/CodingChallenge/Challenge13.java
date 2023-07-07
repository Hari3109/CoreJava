package CodingChallenge;

public class Challenge13 {
public static void main(String[] args) {
//	for compilation cmd/javac <source-file>
//	for Execution cmd/java <class-file>
//	main(String args[])
//	args string holds all the arguments 
//	we can convert all the datatypes from String to sutailbleby using wrapper classes
	if(args.length>=2) {
		
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			System.out.println("number1:"+x);
			System.out.println("number2:"+y);
			System.out.println("Sum:"+(x+y));
			
		
	}else {
		System.out.println("Insufficient Arguments");
	}
}
}
