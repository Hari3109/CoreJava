package StringConcept;

public class mostRepeatingChar {
	static final int NOOFCHAR=256;
public static void main(String[] args) {
	String s="successes";
	System.out.println("original String:"+s);
	char c=mostrepeat(s);
	System.out.println("Most Repeated:"+c);
	
}
public static char mostrepeat(String s) {
	int[] ctr=new int[NOOFCHAR];
	int i=0;
	for(i=0;i<s.length();i++) {
		ctr[s.charAt(i)]++;
	}
	int first=0,second=0;
	for(i=0;i<NOOFCHAR;i++) {
		if(ctr[i]>first) {
			second=first;
			first=i;
		}else if(ctr[i]>ctr[second]&&ctr[i]!=ctr[first]) {
			second=i;
		}
		
	}
	return (char)second;
}
}
