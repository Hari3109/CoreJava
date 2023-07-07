package codingPractice;


public class searchingElementsInArray {
public static void main(String[] args) {
	int a[]= {1,4,6,8};
	int sele=6;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==sele) {
			System.out.println("element found: "+i);
			break;
		}else {
			System.out.println("element not found");
		}
	}
		
}
}
