package bookingsystem;

public class Customer {
	private String title;
	private String firstName;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private String customerNumber;
	private GenderType gender;
	
	public Customer(String title, String firstName, String surname, String address, String phoneNumber, String email,
			String customerNumber, GenderType gender) {
	
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		
		
		
		
		
		
		
		
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Customer() {
	
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Customer [title=" + title + ", firstName=" + firstName + ", surname=" + surname + ", customerNumber="
				+ customerNumber + ", gender=" + gender + "]";
	}
	
	
}
