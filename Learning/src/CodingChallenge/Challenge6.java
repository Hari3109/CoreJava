package CodingChallenge;

public class Challenge6 {
	static
	{
		System.out.println("in static");
	}
public static void main(String[] args) {
//	static block and instance block
//	Defining a block inside the class without the identity
//	we can't access these blocks explicity
//	jvm invokes these members implicitly
//	static block-> @ the time of class loading
//	Instance block->@ the time of obj creation
	{
		System.out.println("in obj");
	}
//	static block execute only once 
//	instance block executes more times
}
}
