package com.cg.oops.part1;

public class Customer {
private int customerId;
private String customerName;
private String address;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Customer(int customerId, String customerName, String address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.address = address;
}
}
