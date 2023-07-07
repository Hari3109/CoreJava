package oopsExercises;
import java.util.*;
public class ExceptionHandling {
public static void main(String[] args) throws ArithmeticException{
	try {
		int x=5;
		int y=0;
		int g=x/y;
		System.out.println("result:"+g);
	}catch(Exception e){
		System.out.println("can't do so");
		
	}
}
}
