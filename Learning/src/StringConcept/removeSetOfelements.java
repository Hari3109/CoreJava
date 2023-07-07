package StringConcept;

import java.util.Arrays;

public class removeSetOfelements {
public static void main(String[] args) {
	String strg="abrambabasc";
	System.out.println("original String :"+strg);
	System.out.println("String after removing");
	removesetofchar(strg,"ac","b");
}
public static void removesetofchar(String str,String pnr1,String pnr2) {
	int n=str.length(),i;
	int ptr=0;
	char[] arr=str.toCharArray();
	for(i=0;i<n;++i) {
		if(arr[i]=='b') {
			continue;
		}else if(i+1<n&&arr[i]=='a'&&arr[i+1]=='c') {
			++i;
		}else {
			arr[ptr++]=arr[i];
		}
	}
	char[] re=Arrays.copyOfRange(arr, 0, ptr);
	System.out.println(new String(re));
}
}
