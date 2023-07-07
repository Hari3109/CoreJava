package oopsExercises;
import java.util.*;
import java.util.stream.Collectors;
public class StreamToRemoveAllDuplicateEle {
  public static void main(String[] args) {
	List<Integer>num=Arrays.asList(1,6,7,8,6);
	List<Integer>distinctNumbers=num.stream()
			.distinct()
			.collect(Collectors.toList());
	System.out.println("after removing duplicate numbers:"+distinctNumbers);
			
}
}
