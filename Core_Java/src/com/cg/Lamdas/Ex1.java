package com.cg.Lamdas;

public class Ex1 {
public static void main(String[] args) {
	AdvBirthdayWishes wish1=new AdvBirthdayWishes();
	postGreetingAPI(wish1,"Harry");
	NewYearGreetings wish2=new NewYearGreetings();
	postGreetingAPI(wish2,"me");
	//lamda expression will be doing here without making classes
	postGreetingAPI( n-> "Hi "+n+" Have a nice Day " , " Dec29 Batch");
	
	Greeting g=(String n)->"hi "+n+" Have a wonder day";
	postGreetingAPI(g,"Batch dec29");
	
}
static void postGreetingAPI(Greeting g,String name) {
	System.out.println(g.wish(name));
}

}
interface Greeting{
	String wish(String n);
	//void f1();
}
class AdvBirthdayWishes implements Greeting{
	public String wish(String n) {
		return "hi " +n+ " happy Birthday";
	}
}
class NewYearGreetings implements Greeting{
	public String wish(String n) {
		return "hi " +n+ " happy new year";
	}
}