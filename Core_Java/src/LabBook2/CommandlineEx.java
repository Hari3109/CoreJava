package LabBook2;

public class CommandlineEx {
	public static void main(String[] args) {
		String x=args[0];
		int a=Integer.parseInt(x);//convert String to Number
		System.out.println(a);
		if(a>0) {
			System.out.println("a is positive number");
		}
		else {
			System.out.println("a is negative number");
		}
	}

}

