package codingPractice;

public class TocheckVowelsInString {
public static void main(String[] args) {
	System.out.println(stringVowels("capgemini"));
}
public static Boolean stringVowels(String in) {
	return in.toLowerCase().matches(".*[aeiou].*");
}
}
