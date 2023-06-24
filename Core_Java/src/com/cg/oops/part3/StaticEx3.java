package com.cg.oops.part3;

public class StaticEx3 {
	
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		
		System.out.println("no of Counters are:"+Counter.count);
		
	}

}
class Counter{
	static int count;
	 Counter() { 
		 count++;
	
		
	}
	 
	
	
}
