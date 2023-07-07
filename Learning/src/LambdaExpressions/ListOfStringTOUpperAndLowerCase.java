package LambdaExpressions;
import java.util.*;
public class ListOfStringTOUpperAndLowerCase {
public static void main(String[] args) {
	 List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

     
     System.out.println("\nOriginal strings:");
     for (String str : stringList) {
         System.out.println(str);
     } 
     stringList.replaceAll(str-> str.toLowerCase());
     System.out.println("\nLowerCase string:");
     for (String str : stringList) {
         System.out.println(str);
     } 
}
}
