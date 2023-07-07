package codingPractice;

public class reverseString {
public static void main(String[] args) {
	
//	String s=null;
//	System.out.println(reverse(s));
	String str="HARIPRIYANKA";
	System.out.println(str);
	System.out.println(reverse(str));
}
public static String reverse(String in) {
	if(in==null)
		throw new IllegalArgumentException(in);
	StringBuilder sd=new StringBuilder();
	char[] chars=in.toCharArray();
	for(int i=chars.length-1;i>=0;i--)
		sd.append(chars[i]);
	return sd.toString();
}
}
