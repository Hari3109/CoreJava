package com.cg.Wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		MyData d1=new MyData();
		d1.setVal(99);//upcasting its automatic
		
		MyData d2=new MyData();
		d2.setVal("Good Morning");//upcasting its automatic
		
		
		int x=(int)d1.getVal();//downcasting-to retrive its mandatory to cast
		System.out.println(x);
		
		String msg=(String)d2.getVal();
		System.out.println(msg);
	}

}
class MyData{
	//here we can store any type of data
	//but while retriving typecasting is mandatory
	//if wrongly done the typecast u will be getting exception
	private Object val;

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
	
}