package com.cg.java_practice;

import java.util.ArrayList;

abstract class Account {
	    protected double balance;
	    
	    public Account(double balance) {
	        this.balance = balance;
	    }
	    
	    public abstract void deposit(double amount);
	    
	    public abstract void withdraw(double amount);
	    
	    public double getBalance() {
	        return balance;
	    }
	}

	class SavingsAccount extends Account {
	    private double fixedDeposit;
	    
	    public SavingsAccount(double balance, double fixedDeposit) {
	        super(balance);
	        this.fixedDeposit = fixedDeposit;
	    }
	    
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }
	    
	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= fixedDeposit) {
	            balance -= amount;
	        }
	    }
	}

	class CurrentAccount extends Account {
	    private double cashCredit;
	    
	    public CurrentAccount(double balance, double cashCredit) {
	        super(balance);
	        this.cashCredit = cashCredit;
	    }
	    
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }
	    
	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= cashCredit) {
	            balance -= amount;
	        }
	    }
	}

	class Bank {
	    private ArrayList<Account> accounts = new ArrayList<>();
	    
	    public void addAccount(Account account) {
	        accounts.add(account);
	    }
	    
	    public double getTotalCashOut() {
	        double totalCashOut = 0;
	        for (Account account : accounts) {
	            totalCashOut += account.getBalance();
	        }
	        return totalCashOut;
	    }
	

	public class main {
	    public static void main(String[] args) {
	        // Create some accounts
	        Account account1 = new SavingsAccount(50000, 10000);
	        Account account2 = new CurrentAccount(30000, 5000);
	        
	        // Add accounts to the bank
	        Bank bank = new Bank();
	        bank.addAccount(account1);
	        bank.addAccount(account2);
	        
	        // Deposit and withdraw some amounts
	        account1.deposit(10000);
	        account1.withdraw(20000);
	        account2.deposit(5000);
	        account2.withdraw(10000);
	        
	        // Calculate the total cash out in the bank
	        double totalCashOut = bank.getTotalCashOut();
	        System.out.println("Total cash out: " + totalCashOut);
	    }
	}

	}
