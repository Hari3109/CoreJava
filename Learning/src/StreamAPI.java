import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI {
public static void main(String[] args) {
	List<Integer>nums=Arrays.asList(4,5,7,9,10);
//	Stream<Integer>s1=nums.stream();
//	s1.filter(n->n%2==0);
//	Stream<Integer>s2=s1.filter(n->n%2==0);
//	Stream<Integer>s3=s2.map(n->n*n);
//	Optional<Integer> result=s3.reduce((c,e)->c+e);
//	Optional<Integer> result=nums.stream()
//	               .filter(n->n%2==0)
//	               .map(n->n*n)
//	               .reduce((c,e)->c+e);
//	System.out.println(result);
	Stream<Integer>sortedvalues=nums.stream()
			.filter(n->n%2==0)
			.sorted();
	sortedvalues.forEach(n->System.out.println(n));
//	if u want to work with multiple thread in that case we have parallel stream with which we can work with more thread
//	s3.forEach(n->System.out.println(n));
//	Stream - is an interface
//	Consumer is a functional interface that has a method named accept
//	every time we will make changes that may effect the original values 
//	u can make the changes in the stream atleast u have ur original values with u
//	u can use stream only once
//	int sum=0;
//	for(int n:nums) {
//		if(n%2==0) { 
//			n=n+2;
//			sum=sum+n;
//			System.out.println(sum);
////			this was the older way of doing operations now we are doing the same in stream
//		}
//	}
//	System.out.println(nums);
}
}
