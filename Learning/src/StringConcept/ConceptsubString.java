package StringConcept;
import java.util.*;
import java.util.Map.Entry;

public class ConceptsubString {
public static void main(String[] args) {
	String str="the quick brown fox jumps over the lazy dog";
	String new_str=str.substring(10, 26);
	System.out.println("old="+str);
	System.out.println("new="+new_str);
	String str1="Java Exercise.";
	char[] arr=str1.toCharArray();
	System.out.println(arr);
	for(char ele:arr) {
		System.out.println(ele);
	}
	HashMap<Integer,String>hashmap=new HashMap<Integer,String>();
	for(Entry<Integer,String>ele1:hashmap.entrySet()) {
		System.out.println(ele1);
	}
}
}
