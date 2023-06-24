package LabBook2;

public class ArrayEx0 {
	public static void main(String[] args) {
	String names[]= new String[5];
	names[0]="albin";
	names[1]="hari";
	names[2]="harry";
	names[3]="dev";
	names[4]="santhu";
	for(String s:names) {
		System.out.println(s);
	}
	}
}
//here we use for each loop and the iteration takes place at the loop itself
//earlier we use normal for loop with initialisation and condition and then increment