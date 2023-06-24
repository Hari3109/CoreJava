package com.cg.oops.part8;

public class EnumEx2 {
	public static void main(String[] args) {
			Emp e1=new Emp(101,"A",Gender.F);
			Emp e2=new Emp(101,"A",Gender.M);
			Emp e3=new Emp(101,"A",Gender.F);
			Emp e4=new Emp(101,"A",Gender.M);
			Emp e5=new Emp(101,"A",Gender.F);
			//male, Male, MALE, M, m
			//System.out.println(e1.empId);
		}
		}
		//type safe enums
		enum Gender{
			M,F
		}
		class Emp{
			private int empId;
			private String empName;
			private Gender gender;
			public Emp(int empId, String empName, Gender gender) {
				super();
				this.empId = empId;
				this.empName = empName;
				this.gender = gender;
			}
			
		}

