package bookingsystem.copy;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static Scanner userinput;
	private double income;

	public static void main(String args[]) {
	
		// Our Arraylists
		// defination:////////////////////////////////////////////////////////
		FlightList flightlist = new FlightList();
		SeatList seatlist = new SeatList();
		CustomerLIst customerlist = new CustomerLIst();
		FoodList foodlist = new FoodList();
		BookingList booklist =new  BookingList();
//////////////////////////////////////////////////////
		Food nofood = new Food(0, "No food", 0, false);
		Food food1 = new Food(1, "Biff with Rice", 99, false);
		Food food2 = new Food(2, "Chicken with Rice", 99, false);
		Food food3 = new Food(3, "Chicken with pasta", 129, false);
		Food food4 = new Food(4, "Beef with pasta", 129, false);
		Food food5 = new Food(5, "General Biff", 179, true);
		Food food6 = new Food(6, "Seafoodgryta", 179, true);

		foodlist.food.add(nofood);
		foodlist.food.add(food1);
		foodlist.food.add(food2);
		foodlist.food.add(food3);
		foodlist.food.add(food4);
		foodlist.food.add(food5);
		foodlist.food.add(food6);
		
		// Airplane airplane1 = new Airplane();
		// ArrayList<Seat> seatlist1 = new ArrayList<>();
		// ArrayList<Customer> customerlist1 = new ArrayList<>();
		// ArrayList<Food> foodlist1 = new ArrayList<>();
		///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
Flight f1 = new Flight("AAA218", "2016-12-20  09:00", "Stockholm", "Paris");
Flight f2 = new Flight("AAA217", "2016-12-20  12:00", "Paris", "Stockholm");
Flight f3 = new Flight("AAA215", "2016-12-20  09:00", "Stockholm", "London");
Flight f4 = new Flight("AAA216", "2016-12-20  12:00", "Stockholm", "London");
flightlist.flight.add(0, f1);
flightlist.flight.add(1, f2);
flightlist.flight.add(2, f3);
flightlist.flight.add(3, f4);
System.out.println(flightlist.flight);

System.out.println("Prepared flight with " + flightlist.flight.size() + " kinds is ready!");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
Customer tempcustomer1 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		31804, GenderType.MALE);
Customer tempcustomer2 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		31482, GenderType.MALE);
Customer tempcustomer3 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		310682, GenderType.MALE);
Customer tempcustomer4 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		3182, GenderType.MALE);
Customer tempcustomer5= new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		316982, GenderType.MALE);
Customer tempcustomer6 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		3128332, GenderType.MALE);
Customer tempcustomer7 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		313872, GenderType.MALE);
Customer tempcustomer8 = new Customer("Mr", "Svan", "svansson", "Sveavägen 8", "073617778", "aaa@gmail.com",
		321872, GenderType.MALE);
customerlist.customer.add(tempcustomer1);customerlist.customer.add(tempcustomer2);customerlist.customer.add(tempcustomer3);customerlist.customer.add(tempcustomer4);customerlist.customer.add(tempcustomer5);customerlist.customer.add(tempcustomer6);customerlist.customer.add(tempcustomer7);customerlist.customer.add(tempcustomer8);
//////////////////////////////////////////////////////











		int count = 10;
		while (count > 0) {
			System.out.println("You have " + count+ "  chances to do something" + "  Please enter an integer!!");
			count--;
			
			System.out.println("00  Prepare Flight seat from sratch ");
			System.out.println("11  Load file with saved data to start ");
			System.out.println("22  customer registration");
			System.out.println("33  search flight  food ");
			System.out.println("44  make a book and get  a bookid");
			System.out.println("55  compute cost for flight");
			System.out.println("66  computer total income for company");	
			System.out.println("77  change booking through bookid ");
			System.out.println("88  Save all information!!!! ");
			
			
		//int myint = 100;
	
				sc = new Scanner(System.in);
				
					String usrInput9 = sc.nextLine();
				
//////////////////////////////////////////////////////////////////////////////////////////
			switch (usrInput9) {
			
			
			
			case "00":System.out.println("Warnning!!!!!!!!This is  Prepare Flight seat food from sratch!!!!!!!!!"); 
			
			
			
			int ii = 1;
			for (int i = 0; i < flightlist.flight.size(); i++)

			{

			int myint1 = 100;
				int planenumber = 1;

				do {
					sc = new Scanner(System.in);
					try {
						System.out.println("We now prepare " + flightlist.flight.get(i));
						System.out.println(
								"Please input an  right integer from  1---3  to define numbers of plane for the flight!");
						// nextInt will throw InputMismatchException
						// if the next token does not match the Integer
						// regular expression, or is out of range

						int usrInput = sc.nextInt();
						myint1 = usrInput;
					} catch (InputMismatchException exception) {
						// Print "This is not an integer"
						// when user put other than integer

						System.out.println("This is not an integer");
					}
				} while (myint1 < 1 || myint1 > 3);

				System.out.println("This is  an  OK  integer");

				for (int k = 1; k < myint1 + 1; k++) {

					String flightname = flightlist.flight.get(i).getFlightname();
					for (int j = 1; j < 11; j++) {
						planenumber = k;
						double value = 5000;
						boolean firstlass = false;
						if (j < 6) {
							value = 20000;
							firstlass = true;
						}

						Seat stempo = new Seat(ii, j, value, firstlass, false, flightname, planenumber);
						++ii;
						seatlist.seat.add(stempo);
						System.out.println("SeatID number: " + stempo.seatid);
						System.out.println(stempo);

					}

				}
			}
			System.out.println(" All flights  " + seatlist.seat.size() + "   seats  is ready!");
			
			
		
			
			 break;

			
			
			case "11":

				System.out.println("This is   Load file with saved data to start!!!!!!!!");
				
				
				
				

				
                    // Loading with XmlIO, in this case the file might be missing.
                    try {
                       
                        
                        booklist = XMLIO.loadObject("booklist.xml", BookingList.class);
                        
                    } catch (IOException ex) {
                        System.out.println("Could not load booklist.xml");
                    }
                    
               
                
				
				
				
                    // Loading with XmlIO, in this case the file might be missing.
                    try {
                        seatlist = XMLIO.loadObject("seatlist.xml", SeatList.class);
                        
                 
                    } catch (IOException ex) {
                        System.out.println("Could not load seatlist.xml");
                    }
                    break;
                
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			case "22":
			
				System.out.println("This is   customer registration!!!!!!");
				
				
				
				Scanner usertitle = new Scanner( System.in );
				String Title;
				System.out.print("Enter your Title: ");
				Title = usertitle.next( );
				System.out.print(" your Title: "+Title+"   is saved.");
				String first_name;
				System.out.print("Enter your first name: ");
				first_name = usertitle.next( );
				System.out.print(" first_name: "+first_name+"   is saved.");
				String family_name;
				System.out.print("Enter your family name: ");
				family_name = usertitle.next( );
				System.out.print(" family_name: "+family_name+"   is saved.");
				String Adress;
				System.out.print("Enter your Adress: ");
				Adress = usertitle.nextLine( );
				System.out.print(" Adress: "+Adress+"   is saved.");
				String telephone;
				System.out.print("Enter your Telephone number");
				telephone = usertitle.nextLine( );
				System.out.print(" telephone: "+telephone+"   is saved.");
				String email;
				System.out.print("Enter your Email");
				email = usertitle.nextLine( );
				System.out.print(" email: "+email+"   is saved.");
				String input2="22";
				GenderType gender = null;
				while(!input2 .equals("yes")||!input2 .equals("no"))
				{
				System.out.println("Are you Male? Please type in 'yes'  or 'no'.");
				
				 input2 = usertitle.nextLine( );
				
				if (input2 .equals("yes")){ gender=GenderType.MALE;}
			
				if (input2 .equals("no")){ gender=GenderType.FEMALE;}
				
				}
	int ist = (int) (new Date().getTime()/1000);
				
				System.out.println("This is " +ist);
				
				Customer customertemp1=new Customer(Title,first_name,family_name,Adress,telephone ,email,ist,gender);
				
			customerlist.add(customertemp1);
			
				   break;
                
                
                
			case "33":
				System.out.println(" All flights  " + seatlist.seat.size() + "   seats  is ready!");
				System.out.println("This is    search flight  and  food!!!!!!!!!");
				String searchItem="no";
				while (!searchItem.equals("yes")) {
					
					for (Flight temp : flightlist.flight)

					{
						System.out.println(temp);
						System.out.println(temp.flightname);
					}
					System.out.println(" See our  all flights service!");
					/////////////////////// find flight and time and
					/////////////////////// seatnumber////////////////////////////////
					System.out.println("Type in the flightname to check if is there vacant seats for you!and input text"
							+ "'ok'" + "to end Search");
					
					userinput = new Scanner( System.in );
					
					
					searchItem = userinput.next( );
					if (searchItem.equals("ok"))
						break;
					
					
				
					for (int kk = 0; (kk + 1) <= seatlist.seat.size(); kk++)

					{

						if (seatlist.seat.get(kk).flightname.equals(searchItem) && seatlist.seat.get(kk).booked == false)

						{
							System.out.println("Seat ID number:" + seatlist.seat.get(kk).seatid);
							System.out.println(seatlist.seat.get(kk));
							
						}

					}
				
			
				}
				
			case "44":

				int myint2 = 100;
				System.out.println("Please input your Seat ID number, which you want book!");

				do {
					Scanner sc = new Scanner(System.in);
					try {
						System.out.println("Please input your Seat ID number, which you want book!");

						// nextInt will throw InputMismatchException
						// if the next token does not match the Integer
						// regular expression, or is out of range

						int usrInput = sc.nextInt();
						myint2 = usrInput;
					} catch (InputMismatchException exception) {
						// Print "This is not an integer"
						// when user put other than integer

						System.out.println("This is not an integer");
					}
				} while (myint2 < 1 || myint2 > 3000);

				System.out.println("This is  an  OK  integer");

				if (seatlist.seat.get((myint2 - 1)).booked == false) {

					seatlist.seat.get((myint2 - 1)).booked = true;
					System.out.println("Your flight is booked");}
					System.out.println(seatlist.seat.get((myint2 - 1)));
					////////////////////////////// book
					////////////////////////////// food//////////////////////////////////
					
					System.out.println("Du you want book food?  input your  food number!!");
					for (Food temp : foodlist.food)
						// for (int i = 0; i <foodlist.food.size(); i++)
						{

							System.out.println(temp);
							System.out.println(temp.menuname);
						}

					System.out.println("Du you want book food?  input your  food number!!");
					int myintfood = 100;
					

					do {
						Scanner sc = new Scanner(System.in);
						try {
							System.out.println("Du you want book food or 'no' food?  input food number!");

							// nextInt will throw InputMismatchException
							// if the next token does not match the Integer
							// regular expression, or is out of range

							int usrInput = sc.nextInt();
							myintfood = usrInput;
						} catch (InputMismatchException exception) {
							// Print "This is not an integer"
							// when user put other than integer

							System.out.println("This is not an right number! do again!");
						}
					} while (myintfood < 0 || myintfood > 6);

					System.out.println("This is  an  OK  integer");
					
					Food foodtemp = new Food(55,"AAA",00,false);
					if (myintfood==0) {
					
						foodtemp = nofood;}
					if (myintfood==1) {
						
						foodtemp = food1;}
					if (myintfood==2) {
						
						foodtemp = food2;}
					if (myintfood==3) {
						
						foodtemp =food3;}

					if (myintfood==4) {
						
						foodtemp = food4;}

					if (myintfood==5) {
						
						foodtemp = food5;}

					if (myintfood==6) {
						
						foodtemp = food6;}

					
					
			System.out.println("Food   " +foodtemp+"   is your choice!  Confirmed!");
			System.out.println(foodtemp);
			System.out.println(seatlist.seat.get((myint2 - 1)));
			
			BookItem booktemp = new BookItem(567,customerlist.customer.get(0), foodtemp, seatlist.seat.get((myint2 - 1)));
			System.out.println("Book is finnished!");
			
			
			
			booklist.add(booktemp);
			System.out.println( booktemp);
			
			break;
			case "55":
				System.out.println("This is  an   compute cost for  the customer to make payment!!!!!!!!!!!!");break;
				
//for (int  i5=0;i5<booklist.bookitem.size(); i5++)
//{
//				
//				
//			System.out.println(booklist.bookitem.get(i5).getCustomerNumber());
//				
//				
//}
//				
				
				
		
			case "66":

				System.out.println("This is  an   change booking through bookid!!!!!!!!!!!"); break;
			
			case "77":

				System.out.println("This is  an  computer total income for company!!!!!!!!!!"); 
			case "88":

				System.out.println("This is  Save!!!!!!!!!!"); 
			
				 {
	                    // Using XmlIO to save the file, errors are unexpected (write protected files)
	                    try {
	                        XMLIO.saveObject("seatlist.xml", seatlist);
	                      
	                    } catch (IOException ex) {
	                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	                    }
	                }
				
				 {
	                    // Using XmlIO to save the file, errors are unexpected (write protected files)
	                    try {
	                        XMLIO.saveObject("booklist.xml", booklist);
	                        break;
	                    } catch (IOException ex) {
	                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	                    }
	                }
				
				
				
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				
				

			}

		}
		
	}
}