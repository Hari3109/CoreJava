package com.cg.Lamdas;

public class Ex2 {
public static void main(String[] args) {
	//create Lambda expression for the functionaal
	//interface Calculator and pass it to
	// doEval funciton
	Calculator c1=(float x,float y)->x+y;
    doEval(c1,12,14);
    Calculator c2=(float x,float y)->x-y;
    doEval(c2,30,14);
	
}

static void doEval(Calculator c,float x ,float y) {
	System.out.println(c.eval(x,y));
}
}
@FunctionalInterface//it ensure the interface is functional interface,this annotation wont allow to add more than one methods,compilation error will occur
interface Calculator{
	float eval(float x,float y);
	//void f1();
}
class Addition implements Calculator{
	public float eval(float x, float y) {
     return x+y;
}
}
class Substraction implements Calculator{
     public float eval(float x, float y) {
      return x-y;
      }
}
