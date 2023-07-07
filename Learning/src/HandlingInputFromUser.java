import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HandlingInputFromUser {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value");
//	int num=System.in.read();
//	System.out.println(num);
	//here System.in.read will give the asky value of the value u entered
//    InputStreamReader in = new InputStreamReader(System.in);
//	BufferedReader bf=new BufferedReader(in);
//	int num=Integer.parseInt(bf.readLine());
//	System.err.println(num);
//	bf.close();
//	instead of using buffered Reader we can use Scanner because of its complexities
	int num=sc.nextInt();
	System.out.println(num);
}
}
