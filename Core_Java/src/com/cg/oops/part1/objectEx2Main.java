package com.cg.oops.part1;

public class objectEx2Main {
	public static void main(String[] args) {
		/*
		 * 
		 * Create Two Account objects
		 * lets say a1 and a2
		 * store data in a1 and a2
		 * print the details of a1 and a2
		 * transfer funds from a1 to a2
		 * by calling a1.transferFunds(a2,5000);
		 *   -means 5000 debited from a1 and
		 *    credited to a2
		 * print the bal of a1 and a2
		 */
         Account a1=new Account();
         a1.accountNo=123456;
         a1.accHolderName="hari priyanka";
         a1.bankBalance=10000.05f;
         System.out.println("accountNo is"+a1.accountNo);
         System.out.println("accHolderName is"+a1.accHolderName);
         System.out.println("accBankBalance is"+a1.bankBalance);
         Account a2=new Account();
         a2.accountNo=987654;
         a2.accHolderName="maneesha";
         a2.bankBalance=3000.07f;
         System.out.println("accountNo is"+a2.accountNo);
         System.out.println("accHolderName is"+a2.accHolderName);
         System.out.println("accBankBalance is"+a2.bankBalance);
         
         
         
	}

}
