package oopsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCovertStringToUpperCase {
public static void main(String[] args) {
	 List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
	    System.out.println("List of strings: " + colors);
	    
	    List < String > uppercase = colors.stream()
	      .map(String::toUpperCase)
	      .collect(Collectors.toList());
	    System.out.println("\n UpperCase String:"+uppercase);
	    List<String>lowercase=colors.stream()
	    		.map(String::toLowerCase)
	    		.collect(Collectors.toList());
	    System.out.println("\n LowerCase Strings:"+lowercase);
			
}
}
