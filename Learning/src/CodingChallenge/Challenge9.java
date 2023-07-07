package CodingChallenge;

public class Challenge9 {
public static void main(String[] args) {
//	continue-it is control statement or branching statement
//	it terminates the current iteration of the loop
	for( int i=0;i<=50;i++) {
		if(i %3==0&&i%5==0) {
			continue;
		}
		if(i%3==0||i%5==0) {
			System.out.println(i);
		}
	}
}
}
