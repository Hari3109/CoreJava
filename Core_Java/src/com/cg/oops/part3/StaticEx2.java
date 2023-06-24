package com.cg.oops.part3;

public class StaticEx2 {
	int x=100;//instance member
	static int y=22;
	public static void main(String[] args) {
		//cannot access instance members directly from the static methods
		//System.out.println(x);
		StaticEx2 s= new StaticEx2();
		System.out.println(s.x);
		s.f1();
		System.out.println(y);
		f2();
    }
void f1() {
	System.out.println("f1 method");
}
static void f2() {
	System.out.println("f2 method");
}
}
