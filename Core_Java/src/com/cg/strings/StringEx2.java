package com.cg.strings;

public class StringEx2 {
public static void main(String[] args) {
	String msg1="hello";
	String msg2="Hello";
	String msg3=msg2.concat("  have a nice day");
	System.out.println(msg1);
	System.out.println(msg2);
	System.out.println(msg3);
	String msg4=msg1.concat(" have a nice day");
	System.out.println(msg4);
}
}
