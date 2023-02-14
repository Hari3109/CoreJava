package com.cg.AmusementParkTicketbooking.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Activity {
	@Id
	@GeneratedValue
	private int activityId;
	private String activityName;
	private int availableSeats;
	private float price;
	@ManyToOne
	@JoinColumn(name = "ticketBookingId")
	private TicketBooking ticketBooking;
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Activity(int activityId,String activityName,int availableSeats,float price) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.availableSeats = availableSeats;
		this.price = price;
	}
	public Activity() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
