package CodingChallenge;

public class Challenge11 {
public static void main(String[] args) {
//	for each loop
//	it was introduced in jdk 1.5
//	it can process the elements of arraysor collection
	int num[]= {1,7,9,5,20};
	int sum=0;
	for(int ele:num) {
		sum+=ele;
		
	}
	System.out.println(sum);
}
}
