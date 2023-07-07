package oopsExercises;
import java.util.*;
public class StreamApiAvgNo {
public static void main(String[] args) {
	List<Integer>nums=Arrays.asList(1,4,6,8,3);
	System.out.println(nums);
	double avg=nums.stream()
		.mapToDouble(Integer::doubleValue)
		.average()
		.orElse(0);
	System.out.println("average values :"+avg);
	int max=nums.stream()
			.max(Integer::compare)
			.orElse(null);
	System.out.println(max);
	int min=nums.stream()
			.min(Integer::compare)
			.orElse(null);
	System.out.println(min);
			
}
}
