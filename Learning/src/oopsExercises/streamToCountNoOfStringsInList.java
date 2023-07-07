package oopsExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamToCountNoOfStringsInList {
public static void main(String[] args) {
	List<String>color=Arrays.asList("blue","brown","black","red","orange");
	char start='b';
	long ctr=color.stream()
			.filter(s->s.startsWith(String.valueOf(start)))
			.count();
	System.out.println("\nNumber of colors starting with B:"+ctr);
	List<String>ascending=color.stream()
			.sorted()
			.collect(Collectors.toList());
	System.out.println("Ascending order:"+ascending);
	List<String>descending=color.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
	System.out.println("Ascending order:"+descending);
}
}
