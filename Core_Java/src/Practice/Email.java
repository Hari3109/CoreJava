package Practice;

import java.util.regex.Pattern;

public class Email {
Header header;
String body;
String greetings;
public Email(Header header,String body,String greetings) {
	super();
	this.header=header;
	this.body=body;
	this.greetings=greetings;
}
}
class Header{
	String from;
	String to;
	public Header(String from,String to) {
		super();
		this.from=from;
		this.to=to;
	}
}
class EmailOperations{
	public static int emailVerify(Email e) {
		String s="^([a-zA-Z_]{1}[a-zA-Z]+@([a-zA-Z]\\.([a-zA-Z]{2,30})$";
		int value;
		boolean m1,m2;
		m1=Pattern.matches(s,e.header.from);
		m2=Pattern.matches(s,e.header.to);
		if(m1&&m2==true) {
			value=2;
		}
		else if(m1||m2==true) {
			value=1;
		}
		else {
			value=0;
		}
		return value;
	}
	public static String bodyEncryption(Email e) {
		StringBuffer result=new StringBuffer();
		for(int i=0;i<e.body.length();i++) {
			if(Character.isUpperCase(e.body.charAt(i))) {
				char ch=(char)((int)e.body.charAt(i)+(3-65)%26+65);
				result.append(ch);
			}
			else if(Character.isSpace(e.body.charAt(i))) {
				result.append(e.body.charAt(i));
			}
			else {
				char ch=(char)((int)e.body.charAt(i)+(3-97)%26+97);
				result.append(ch);
			}
		}
		return result.toString();
	}
	public static String greetingMessage(Email e) {
		String s1=e.greetings;
		String s2=e.header.from;
		int i=s2.indexOf("@");
		StringBuffer sb=new StringBuffer();
		sb.append(s2);
		StringBuffer sb2=sb.delete(i, sb.length());
		String concat=s1.concat("").concat(sb2.toString());
		return concat;
	}
}	
