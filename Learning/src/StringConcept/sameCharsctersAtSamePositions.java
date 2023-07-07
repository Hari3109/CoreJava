package StringConcept;

public class sameCharsctersAtSamePositions {
public static void main(String[] args) {
	String str1="Hari";
	String str2="hari";
	int res=str1.compareTo(str2);
	int resu=str1.compareToIgnoreCase(str2);
	if(resu<0) {
		System.out.println("\n"+str1+" is less than "+str2);
	}else if(resu==0) {
		System.out.println("\n"+str1+" is equal to the "+str2);
	}else {
		System.out.println("\n"+str1+ "is greater than "+str2);
	}
	String d=str1.concat(str2);
	System.out.println(d);
}
}
