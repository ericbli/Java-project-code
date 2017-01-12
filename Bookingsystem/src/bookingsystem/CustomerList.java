package bookingsystem;

import java.util.ArrayList;

public class CustomerList {
	
	  public ArrayList<Customer> customer=new ArrayList<>();
	  
		public void add(Customer customer) {
			// TODO Auto-generated method stub

}
		
		
		

		public ArrayList<Customer> creatcustomer(){
			Customer tempcustomer1 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"31804", GenderType.MALE);
			Customer tempcustomer2 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"31482", GenderType.MALE);
			Customer tempcustomer3 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"310682", GenderType.MALE);
			Customer tempcustomer4 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"3182", GenderType.MALE);
			Customer tempcustomer5= new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"316982", GenderType.MALE);
			Customer tempcustomer6 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"3128332", GenderType.MALE);
			Customer tempcustomer7 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"313872", GenderType.MALE);
			Customer tempcustomer8 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"321872", GenderType.MALE);
			Customer tempcustomer9 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
					"321842", GenderType.MALE);
		ArrayList<Customer>customerlist = new ArrayList<>();
		
		customerlist.add(tempcustomer1);
		
		customerlist.add(tempcustomer2);
		customerlist.add(tempcustomer3);
		customerlist.add(tempcustomer4);
		customerlist.add(tempcustomer5);
		customerlist.add(tempcustomer6);
		customerlist.add(tempcustomer7);
		customerlist.add(tempcustomer8);
		customerlist.add(tempcustomer9);
		return customerlist;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}