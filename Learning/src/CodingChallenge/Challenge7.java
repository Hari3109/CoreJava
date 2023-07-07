package CodingChallenge;

public class Challenge7 {
public static void main(String[] args) {
//	string to int conversion
String x="10";
String y="20";
  try {
    int a=Integer.parseInt(x);
    int b=Integer.parseInt(y);
    System.out.println("sum:"+ (a+b));
  }catch(NumberFormatException e) {
	  System.out.println("Invalid Input");
  }
}


}
