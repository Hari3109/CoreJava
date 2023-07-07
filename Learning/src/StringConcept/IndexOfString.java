package StringConcept;

public class IndexOfString {
public static void main(String[] args) {
	String str="The quick brown fox over the lazy dog.";
	int a=str.indexOf("a", 0);
	int b=str.indexOf("b", 0);
	int c=str.indexOf("c", 0);
	int d=str.indexOf("d", 0);
	int e=str.indexOf("e", 0);
	int f=str.indexOf("f", 0);
	System.out.println("a b c d e f");
	System.out.println("==============");
	System.out.println(a+""+b+""+c+""+d+""+e+""+f+"\n");
}
}
