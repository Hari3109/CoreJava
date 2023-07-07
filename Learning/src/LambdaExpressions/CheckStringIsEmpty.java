package LambdaExpressions;

import java.util.function.Predicate;

public class CheckStringIsEmpty {
public static void main(String[] args) {
	Predicate isEm=str->((String) str).isEmpty();
	String str1="";
	String str2="Java lambda expression";
	System.out.println("String1:"+str1);
	System.out.println("string 1 is empty:"+isEm.test(str1));
	System.out.println("String1:"+str2);
	System.out.println("string 1 is empty:"+isEm.test(str2));
	
}

}
