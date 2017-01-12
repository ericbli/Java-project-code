package bookingsystem;

import java.util.ArrayList;

public class BookingList {

	private ArrayList<BookItem> bookitem = new ArrayList<>();


	public BookingList(ArrayList<BookItem> bookitem) {
		super();
		this.bookitem = bookitem;
	}

	public BookingList() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<BookItem> getBookitem() {
		return bookitem;
	}

	public void setBookitem(ArrayList<BookItem> bookitem) {
		this.bookitem = bookitem;
	}


	@Override
	public String toString() {
		return "BookingList [bookitem=" + bookitem + "]";
	}


}
	
	
	
	
	
	
	
	
	
	
	


