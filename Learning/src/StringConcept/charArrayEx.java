package StringConcept;

public class charArrayEx {
public static void main(String[] args) {
	char[] o= new char[]{'1','3','6','9'};
	String str=String.copyValueOf(o,1,2);
	System.out.println("\n no of pages in book is "+str);
}
}
