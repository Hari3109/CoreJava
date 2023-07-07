package StringConcept;

public class toSpecifytheStrContainSpecificChar {
public static void main(String[] args) {
	String n="PHP Exercises and Python Exercises";
	String s="hari";
	if(n.contains(s)) {
		System.out.println("it contains the value");
	}else {
		System.out.println("it doesn't contains the give value");
	}
	System.out.println(n.contentEquals(s));
}
}
