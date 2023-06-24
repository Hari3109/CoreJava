package LabBook4;

public class AccountBalance {
	public static void main(String[] args) {
		Account a1=new Account(6000,"Smith");
		Account a2=new Account(3000,"Kathy");
		Account a3=new Account();
		a3.setBalance(2000);
		a3.setAccHolder("happy");
		System.out.println(+a1.getBalance()+"\t" +a1.getAccHolder()+"\t"+a1.getAccNum());
		System.out.println(+a2.getBalance()+"\t" +a2.getAccHolder()+"\t"+a2.getAccNum());
		System.out.println(+a3.getBalance()+"\t" +a3.getAccHolder()+"\t"+a3.getAccNum());
		a1.display();
		a1.deposit(1000);
		System.out.println(a1.getBalance());
		a2.display();
		a2.withdraw(1000);
		System.out.println(a2.getBalance());
		
		
	}

}
