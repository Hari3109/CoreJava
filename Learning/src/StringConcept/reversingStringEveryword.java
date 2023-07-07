package StringConcept;

public class reversingStringEveryword {
public static void main(String[] args) {
	String str="Hari Priyanka is at mumbai";
	String str1=reverseEachwordInString(str);
	System.out.println(str1);
}
public static String reverseEachwordInString(String str) {
	String[] s1=str.split("");
	String revstring="";
	for(int i=0;i<s1.length;i++) {
		String word=s1[i];
		String revword="";
		for(int j=word.length()-1;j>=0;j--) {
			revword=revword+word.charAt(j);
			
		}
		 revstring=revstring+revword+"";
		
	}
	
	return  revstring;
}
}
