package com.cg.oops.part8;

public class WithoutEnum {
	public static void main(String[] args) {
		Booking status=Booking.Booked;
		
		switch (status) {
		case Booked:
			System.out.println("Ticket Confirmed");
			break;
		case Cancelled:
			 System.out.println("Your ticket is cancelled");
		   break;
		case WL:
			System.out.println("Its in waiting list....");
		
		}
	}
	}
	enum Booking{
		Booked, Cancelled,WL
	
}
