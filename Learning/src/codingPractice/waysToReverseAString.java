package codingPractice;

public class waysToReverseAString {
public static void main(String[] args) {
//	using concantination string
	String str="adbg";
	String re="";
	for(int i=str.length()-1;i>=0;i--) {
		re=re+str.charAt(i); 
	}
	System.out.println(re);
}
}
