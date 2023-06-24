package LabBook2;

public class PolymorphimEx2 {
	public static void main(String[] args) {
		SMS sms=new SMS();
		notification(sms);
		System.out.println("-----");
		notification(new whatsApp());
		System.out.println("------");
		notification(new Email());
		
	}
static void notification(Message msg) {
	msg.info();
}
}
class Message{
	void info() {
		System.out.println("u have a message");
	}
}
class SMS extends Message{
	void info() {
		System.out.println("u have a SMS");
	}
	
}
class whatsApp extends Message{
	void info() {
		System.out.println("u have recieved a whatsapp message");
	}
	
}
class Email extends Message{
	void info() {
		System.out.println("u have an Email");
	}
	
}
