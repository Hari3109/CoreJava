package CodingChallenge;

public class Challenge14_Part2 extends Challenge14{

	public Challenge14_Part2(int age, String name) {
		super(age, name);
	}
    public static void main(String[] args) {
    	Challenge14_Part2 e=new Challenge14_Part2(14,"Hari");
    	System.out.println();
//    	here we can't access the private modifiers over here in same package and after inheritence
	}
}
