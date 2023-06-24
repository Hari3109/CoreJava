package com.cg.Icompass;

public class Activity {
String String1;
String String2;
String operator;
public Activity(String String1,String String2,String operator) {
	this.String1=String1;
	this.String2=String2;
	this.operator=operator;
}
}
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Source{
	public handleException(Activity a){
		String s1=a.String1;
		String s2=a.String2;
		String s3=a.operator;
		try {
			if(s1==null||s2==null)
				throw new NullPointerException("Null values found");
			else if(s3!="+"&&s3!="-")
				throw new MyException(s3);
			}catch(NullPointerException e) {
				return e.getMessage();
			}catch(MyException ex) {
				return ex.getMessage();
			}
		return "No Exception Found";
	}
	public String doOperation(Activity a) {
		String s1=a.String1;
		String s2=a.String2;
		String s3=a.operator;
		String s="";
		switch(s3){
		case "+":s=s1+s2;
		break;
		case "-":s=s1.replace(s2,"");
		break;
		}
		return s;
	}
}