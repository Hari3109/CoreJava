package codingPractice;

public class findTheLagestOf3Numbers {
public static void main(String[] args) {
	int a=2;
	int b=7;
	int c=89;
	if(a>b&&a>c) {
		System.out.println("a is largest");
	}else if(b>c){
		System.out.println("b is largest");
	}else {
		System.out.println("c is largest");
	}
//	turnary operator
	int largest=a>b?a:b;
    largest= c>largest?c:largest;
    System.out.println(largest);
}
}
