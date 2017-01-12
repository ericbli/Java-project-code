package bookingsystem;

import java.util.Date;

public class Flight {
	String flightname;
	String Flightdate;
	String departure_palce;
	String destination;
	
	
	
	
	
	
	public Flight(String flightname, String flightdate, String departure_palce, String destination) {
		super();
		this.flightname = flightname;
		Flightdate = flightdate;
		this.departure_palce = departure_palce;
		this.destination = destination;
	}
	public String getFlightname() {
		return flightname;
	}
	public String getFlightdate() {
		return Flightdate;
	}
	public String getDeparture_palce() {
		return departure_palce;
	}
	public String getDestination() {
		return destination;
	}
	@Override
	public String toString() {
		return "Flight [flightname=" + flightname + ", Flightdate=" + Flightdate + ", departure_palce="
				+ departure_palce + ", destination=" + destination + "]";
	}
		
	
	

}
