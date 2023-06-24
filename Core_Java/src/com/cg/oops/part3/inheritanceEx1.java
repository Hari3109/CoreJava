package com.cg.oops.part3;

public class inheritanceEx1 {
	public static void main(String[] args) {
		Book book=new Book();
		book.setProdId(101);
		book.setProdName("Wings of fire");
		book.setPrice(888.9f);
		book.setGenre("Biography");
		book.setAuthour("Abdul Khalam");
		Laptop laptop=new Laptop();
		laptop.setProdId(103);;
		laptop.setProdName("Dell Laptop");
		laptop.setPrice(600000);
		laptop.setCpuType("i5");
		laptop.setOs("windows 11");
		  
	         System.out.println("Book ID       :"+ book.getProdId());
	         System.out.println("Book Name     :"+ book.getProdName());
	         System.out.println("Book Price    :"+book.getPrice());
	         System.out.println("Book Author   :"+book.getAuthour());
	         System.out.println("Book Genre    :"+book.getGenre());

	        
	         System.out.println("Laptop ID     :"+laptop.getProdId());
	         System.out.println("Laptop Name   :"+laptop.getProdName());
	         System.out.println("Laptop Price  :"+laptop.getPrice());
	         System.out.println("Laptop CPU    :"+laptop.getCpuType());
	         System.out.println("Laptop OS     :"+laptop.getOs());
	       
	         Product myCart[]= {book,laptop};
	         for(int i=0;i<myCart.length;i++) {
	        	 System.out.println(myCart[i].getProdName());
	        	 System.out.println(myCart[i].getPrice());
	        	 System.out.println(myCart[i].getProdId());
	         }
	}

}
