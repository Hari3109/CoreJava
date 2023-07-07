package codingPractice;

public class DuplicateElementsInArray {
public static void main(String[] args) {
	String a[]= {"java","c","c++","java"};
	boolean flag=false;
    for(int i=0;i<a.length;i++) {
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]==a[j]) {
    			System.out.println("found duplicate element"+a[i]);
    			flag=true;
    		}
    	}
    }
    if(flag==false) {
	System.out.println("duplicate element not found");
    }
}
}
