package com.cg.strings;

public class Stringto {
	public static void main(String[] args) {
       Customer c1=new Customer(101,"hari");
       System.out.println(c1);//internally toString() method called
       System.out.println(c1.toString());
        String s="Banglore";
       System.out.println(s);//internally toString() method gets called
        System.out.println(s.toString());

		}

		}

		class Customer{

		private int custId;

		private String custName;

		public Customer(int custId, String custName) {

		super();

		this.custId = custId;

		this.custName = custName;

		}

		@Override

		public String toString() {

		return "Customer [custId=" + custId + ", custName=" + custName + "]";

		}

		 

		}

