package com.cg.oops.part2;

public class EmployeeData {
	public static void main(String[] args) {
		
		Address a= new Address();
		a.setDoorNo("50/A");
		a.setPlaceName("Chennai");
		a.setPinCode(533006);
		Employee e= new Employee();
		e.setEmpId(234);
		e.setEmpName("Hari Priyanka");
		e.setEmpAddress(a);
		System.out.println("Employee id is:"+e.getEmpId());
		System.out.println("Employee name is:"+e.getEmpName());
		Address a1=e.getEmpAddress();
		System.out.println(a1.getDoorNo());
		System.out.println(a1.getPlaceName());
		System.out.println(a1.getPinCode());
		
		
		
		
		
		
	}

}
