package StringConcept;

public class ReplaceString {
 public static void main(String[] args) {
	String str= "The quick brown fox jumps over the lazy dog.";
	String st=str.replace("fox", "cat");
	System.out.println("original string:"+str);
	System.out.println("New String:"+st);
	String str1="red is favorite color.";
	String str2="orange is also my favourite color.";
	String st1="red";
	boolean s1=str1.startsWith(st1);
	boolean s2=str2.startsWith(st1);
	System.out.println(str1+ " starts with "+st1+ "?"+s1);
}
}
