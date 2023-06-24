package Test;

public class Reverse {
public static void main(String[] args) {
	String str="Hello";
	String reversed=reversedString(str);
	System.out.println(str);
	System.out.println(reversed);
	
}

private static String reversedString(String str) {
	char[] charArray=str.toCharArray();
	int left=0;
	int right=charArray.length-1;
	while(left<right) {
		char temp=charArray[left];
		charArray[left]=charArray[right];
		charArray[right]= temp;
		left++;
		right--;
		
		
	}
	return new String(charArray);
}
}
