package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class toSortTheString {
public static void main(String[] args) {
	List<String>s=Arrays.asList("hari","priya","santhu","Appa","Amma");
	System.out.println("original String");
	for(String st:s) {
		System.out.println(st);
	}
	List<String> alphabetical=s.stream()
			.sorted((str1,str2)->str1.compareToIgnoreCase(str2))
			.collect(Collectors.toList());
	System.out.println("\nSorted String");
	for(String e:alphabetical) {
		System.out.println(e);
	}
	String searchword="hari";
	Predicate<String>containword=word->word.equals(searchword);
	boolean flag=s.stream().anyMatch(containword);
	System.out.println("\n is the word " +searchword+ " present in the list "+ flag);
}
}
