package oopsExercises;

public class StringvowelsException {
public static void main(String[] args) {
	try {
		String in="Capgemini";
		System.out.println("original String: "+in);
		checkVowels(in);
		System.out.println("String contains vowels");
	}catch(NoVowelsException e) {
		System.out.println("Error:"+e.getMessage());
	}
}

private static void checkVowels(String in) throws NoVowelsException {
	boolean c=false;
	String v="aeiouAEIOU";
	for(int i=0;i<in.length();i++) {
		char ch=in.charAt(i);
		if(v.contains(String.valueOf(ch))) {
			c=true;
			break;
		}
	}
	if(!c) {
		throw new NoVowelsException("String does not contains any vowels.");
	}
	
}
}
class NoVowelsException extends Exception{
	public NoVowelsException(String m) {
		super(m);
	}
}
