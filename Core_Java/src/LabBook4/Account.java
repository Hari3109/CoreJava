package LabBook4;

public class Account {
	private static int counter=0;
	private double accNum;
	private double balance;
	private String accHolder;
	{
		this.accNum=++counter;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(accHolder+"deposited with"+amount);
		System.out.println("Total Account balance"+balance);
	}
	void withdraw(double amount) {
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+"withdraw from"+accHolder);
			System.out.println("total Account Balance"+balance); 
			
		}
		else {
			System.out.println("insufficient funds");
		}
	}
	void balance(double amount) {
		System.out.println("balance is "+getBalance());
	}
	public double getAccNum() {
		return accNum;
	}
	public void setAccNum(double accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public Account() {
		
	}
	public Account(double balance, String accHolder) {
		super();
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public void display() {

		System.out.println("**********Account details***********");

		System.out.println("Account Holder name:"+accHolder);

		System.out.println("Account Number: "+accNum);

		System.out.println("Account Balance: "+balance);
	
		
	}

}
