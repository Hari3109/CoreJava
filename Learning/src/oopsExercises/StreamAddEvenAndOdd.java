package oopsExercises;

import java.util.Arrays;
import java.util.List;

public class StreamAddEvenAndOdd {
	public static void main(String[] args) {
 List<Integer>i=Arrays.asList(1,5,6,8,3,5,2);
 int evensum=i.stream()
      .filter(num->num%2==0)
      .mapToInt(Integer::intValue)
      .sum();
 System.out.println("Sum of even:"+evensum);
 int oddsum=i.stream()
	      .filter(num->num%2!=0)
	      .mapToInt(Integer::intValue)
	      .sum();
	 System.out.println("Sum of even:"+oddsum);

}
}