package StringConcept;

public class StringLength {
public static void main(String[] args) {
	String str="the string length of 'example.com' is:";
	int c=str.length();
	System.out.println(str+":"+c);
	String str1="hari";
	String str2="priyanka";
	String str3=str1.concat(str2);
	System.out.println("combined String:"+str3);
	System.out.println(str3.contains(str1));
	String s1="example.com", s2="Example.com";
	CharSequence cs="example.com";
    System.out.println("comparing "+s1+"and"+cs+":"+s1.contentEquals(cs));
    System.out.println("comparing "+s2+"and"+cs+":"+s2.contentEquals(cs));
    
			
			
			
			
			
			
			
}
}
