package com.cg.oops.part1;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCustomerId(101);
		c1.setCustomerName("Hari Priyanka");
		c1.setAddress("chennai");
		
		System.out.println("id is:"+c1.getCustomerId());
		System.out.println("name is:"+c1.getCustomerName());
		System.out.println("Address is:"+c1.getAddress());
		updateCustomer(c1);
		System.out.println("Address is:"+c1.getAddress());
		Customer c2=new Customer();
		c2.setCustomerId(102);
		c2.setCustomerName("arun");
		c2.setAddress("pune");
		System.out.println(c2.getCustomerName()+" is living in "+c2.getAddress());
		c2=c1;
		System.out.println(c2.getCustomerName()+" is living in "+c2.getAddress());
	}
	static void updateCustomer(Customer cust) {
	cust.setAddress("bangalore");

}
}
