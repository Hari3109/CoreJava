import java.util.HashMap;
import java.util.Map;

public class CountCharacterusingmap {
public static void main(String[] args) {
	String input= "HariPriyanka";
	Map<Character,Integer> charcount=countCharcter(input);
	System.out.println("characterCount:");
	for(Map.Entry<Character,Integer>entry:charcount.entrySet()) {
		System.out.println(entry.getKey() +" :"+ entry.getValue());
	}
	
}

private static Map<Character, Integer> countCharcter(String input) {
   Map<Character,Integer>charcount=new HashMap<>();
   for(char ch:input.toCharArray()) {
	   if(Character.isLetter(ch)) {
		   charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
	   }
	   
   }
	return charcount;
}
}
