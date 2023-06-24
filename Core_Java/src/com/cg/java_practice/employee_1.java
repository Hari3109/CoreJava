package com.cg.java_practice;

public class employee_1 {
private String name;
private double salary;
public employee_1(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Double calculateSalary(){
	return salary;
}

public class manager extends employee_1{
	private double insentive;

	public double getInsentive() {
		return insentive;
	}

	public void setInsentive(double insentive) {
		this.insentive = insentive;
	}

	public manager(String name, double salary, double insentive) {
		super(name, salary);
		this.insentive = insentive;
	}
	
}
}