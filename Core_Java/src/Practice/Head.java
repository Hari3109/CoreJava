package Practice;

public class Head {
String sender;
String reciever;
public Head(String sender, String reciever) {
	this.sender= sender;
	this.reciever= reciever;
}
}
class Email{
	Head head;
	String body;
	String greetings;
	public Email(Head head,String body,String greetings) {
		this.head=head;
		this.body=body;
		this.greetings=greetings;
	}
}
class EmailImplementation{
	public int validateEmail(Email e) {
		String s1=e.head.sender;
		String s2=e.head.reciever;
		int i=0;
		if(s1.matches("[a-zA-z_]*[@]{1}{a-z]*[/.][a-z]*")&&s2.matches("[a-zA-z_]*[@]{1}[a-z]*[/.][a-z]*")) {
		i=2;
		}
		else if(s1.matches("[a-zA-z_]*[@]{1}[a-z]*[/.][a-z]")||s2.matches("[a-zA-z_]*[@]{1}[a-z]*[/.][a-z]")) {
			i=1;
		}
		return i;
		
	}
	public String greetingMessage(Email e) {
		int x=e.head.sender.indexOf("@");
		return e.greetings+" "+e.head.sender.substring(x);
	}
}