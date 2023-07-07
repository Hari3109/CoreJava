interface FT{
	int Dog(int i,int j);
}

public class LamdaExpressions {
//we are basically simplyfying the Annonymous class as a lamda expression
	public static void main(String[] args) {
//		FT obj=(/*u can pass the parameters over here like int i if in case there is any parameter having there*/)->  //this is said to be lamda expression
//		{
//			System.out.println("in Dog");
//		};
//		obj.Dog();
		FT ju=(int i,int j)->  (i+j); // i+j itself return the value with out the return keyword
		int result=ju.Dog(6,8);
		System.out.println(result);
//		lamda expresions work with only functinal interface
	}
}
