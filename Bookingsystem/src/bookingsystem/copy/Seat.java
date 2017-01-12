package bookingsystem.copy;

import java.util.function.BooleanSupplier;

public class Seat {
	int seatid;
	int seatnumber;
	double value;
	boolean firstclass;
	Boolean booked;
	String flightname;
	int airplanenumber;

	
	public Seat(int seatid, int seatnumber, double value, boolean firstclass, Boolean booked, String flightname,
			int airplanenumber) {
		super();
		this.seatid = seatid;
		this.seatnumber = seatnumber;
		this.value = value;
		this.firstclass = firstclass;
		this.booked = booked;
		this.flightname = flightname;
		this.airplanenumber = airplanenumber;
	}

	public Seat() {

	}

	public void setFirstclass(Boolean firstclass) {
		this.firstclass = firstclass;
	}

	public Boolean getFirstclass() {
		return firstclass;
	}

	public void setBooked(Boolean booked) {
		this.booked = booked;
	}

	public Boolean getBooked() {
		return booked;
	}

	int getNumber() {
		return seatnumber;
	}

	void setNumber(int number) {
		this.seatnumber = number;
	}

	public double getValue() {
		return value;
	}

	public boolean isFirstclass() {
		return firstclass;
	}

	public void setFirstclass(boolean firstclass) {
		this.firstclass = firstclass;
	}

	
	
	
	public int getSeatid() {
		return seatid;
	}

	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}

	@Override
	public String toString() {
		return "Seat [seatid=" + seatid + ", seatnumber=" + seatnumber + ", value=" + value + ", firstclass="
				+ firstclass + ", booked=" + booked + ", flightname=" + flightname + ", airplanenumber="
				+ airplanenumber + "]";
	}

	
	
	
	

	}


