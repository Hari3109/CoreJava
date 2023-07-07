package StringConcept;

public class StringEquals {
public static void main(String[] args) {
	String str1="java exercise";
	String str2=new StringBuffer("java").append("Excerises").toString();
	String str3=str1.intern();
	System.out.println("str1 == str2?"+(str1==str2));
	System.out.println("str1==str3?"+(str1==str3));
}
}
