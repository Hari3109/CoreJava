package com.cg.Wrapper;

public class Generics {
	//Generic --.paramerize type
	 /*
	  * Accept single type of data
	  *while reading no need of typecasting
	  *so that v can classcastexception
	  */
	public static void main(String[] args) {
		Data<Integer> d1= new Data<Integer>();
		d1.setVal(10);//accept only integer
		
		Data<String> d2= new Data<String>();
		d2.setVal("Hello");//accept only String

		int x= d1.getVal();//no need of casting
		System.out.println(x);
		String s=d2.getVal();//no need of casting
		System.out.println(s);
	}

}
class Data<E>{
	private E val;

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}
	
}