package codingPractice;

public class missingNuminArray {
public static void main(String[] args) {
	int a[]= {1,2,4,5};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
	}
	int sum1=0;
	for(int i=1;i<=5;i++) {
		sum1+=a[i];
	}
	int m=sum1-sum;
	System.out.println(m);
}
}
