package CodingChallenge;

import java.util.Random;

public class Challenge4 {
public static void main(String[] args) {
	Random rm=new Random();
	for( int i=0;i<20;i++) {
	int x=rm.nextInt(101)+100;
	System.out.println(x);
	}
}
}
