package StringConcept;

public class StringToByteConvertion {
public static void main(String[] args) {
	String str="This is a sample String";
	byte[] b=str.getBytes();
	String s=new String(b);
	System.out.println("the string equals "+s+"\n");
}
}
