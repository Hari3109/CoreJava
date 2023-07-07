package CodingChallenge;

public class Challenge21 {
//Arrays:
	public static void main(String[] args) {
		
	
	int a[]= {4,6,8,9,2};
	int c=a[0];
	for(int ele:a) {
		if(ele>c) {
			c=ele;
			
		}
		
	}
	System.out.println("largest number:"+c);
}
}