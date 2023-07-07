package StringConcept;

import org.hibernate.internal.build.AllowSysOut;

public class charAtInAString {
public static void main(String[] args) {
	String str="java exercise";
	System.out.println("Oringing String = " +str);
	int index1=str.charAt(0);
	int index2=str.charAt(10);
	System.out.println("the character at position 0 is "+(char)index1);
	int val=str.codePointAt(9);
	System.out.println("character(unicode point) =" +val);
}
}
