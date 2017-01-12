package bookingsystem;

import java.util.ArrayList;

public class BookItem {
	String BookingID;
	Customer customer;
	Food food;
	Seat seat;
	
	
	
	public BookItem(String bookingID, Customer customer, Food food, Seat seat) {
		super();
		BookingID = bookingID;
		this.customer = customer;
		this.food = food;
		this.seat = seat;
	}
	//	public BookItem(Customer customer, Food food, Seat seat) {
//		super();
//		this.customer = customer;
//		this.food = food;
//		this.seat = seat;
//	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "BookItem [BookingID=" + BookingID + ", customer=" + customer + ", food=" + food + ", seat=" + seat
				+ "]";
	}

}
