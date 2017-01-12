package bookingsystem;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

import AAA.NumbersTask;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static Scanner userinput;
	private static double income = 0.0;
	private static Scanner usertitle;
	private static Scanner sc2;

	public static FlightList flightlist = new FlightList();
	public static FoodList foodlist = new FoodList();
	public static SeatList seatlist = new SeatList();
	public static CustomerList customerlist = new CustomerList();
	// public static FoodList foodlist = new FoodList();
	public static BookingList booklist = new BookingList();
	public static Customer customertemp = null;
	public static Food foodtemp = null;
	public static Seat seattemp = null;

	public static void main(String args[]) {

		Food nofood = new Food(0, "No food", 0, false);
		Food food1 = new Food(1, "Biff with Rice", 99, false);
		Food food2 = new Food(2, "Chicken with Rice", 99, false);
		Food food3 = new Food(3, "Chicken with pasta", 129, false);
		Food food4 = new Food(4, "Beef with pasta", 129, false);
		Food food5 = new Food(5, "General Biff", 179, true);
		Food food6 = new Food(6, "Seafoodgryta", 179, true);

		// foodlist.add(nofood);
		// foodlist.add(food1);
		// foodlist.add(food2);
		// foodlist.add(food3);
		// foodlist.add(food4);
		// foodlist.add(food5);
		// foodlist.add(food6);
		//
		foodlist.food.add(0, nofood);
		foodlist.food.add(1, food1);
		foodlist.food.add(2, food2);
		foodlist.food.add(3, food3);
		foodlist.food.add(4, food4);
		foodlist.food.add(5, food5);
		foodlist.food.add(6, food6);
		System.out.println(foodlist.food);
		FoodList foodlist1 = new FoodList();
		ArrayList<Food> foodlist2 = foodlist1.createmenu();
		// foodlist=foodlist2;
		// System.out.println(foodlist);
		// Airplane airplane1 = new Airplane();
		// ArrayList<Seat> seatlist1 = new ArrayList<>();
		// ArrayList<Customer> customerlist1 = new ArrayList<>();
		// ArrayList<Food> foodlist1 = new ArrayList<>();
		///////////////////////////////////////////////////////////////////////////////////////////////
		Flight f1 = new Flight("AAA218", "2016-11-25  17:00:00", "Stockholm", "Paris");
		Flight f2 = new Flight("AAA217", "2016-11-25  17:00:00", "Paris", "Stockholm");
		Flight f3 = new Flight("AAA215", "2016-11-25  17:00:00", "Stockholm", "London");
		Flight f4 = new Flight("AAA216", "2016-11-25  15:00:00", "London", "Stockholm");

		flightlist.flight.add(0, f1);
		flightlist.flight.add(1, f2);
		flightlist.flight.add(2, f3);
		flightlist.flight.add(3, f4);
		System.out.println(flightlist.flight);

		System.out.println("Prepared flight with " + flightlist.flight.size() + " kinds is ready!");

		CustomerList customerlist1 = new CustomerList();
		ArrayList<Customer> customerlist2 = customerlist1.creatcustomer();
		System.out.println("Number of customers:  " + customerlist2.size());
		System.out.println(customerlist2);
		//////////////////////////////////////////

		// // Runnable Object
		// Threadtask task = new Threadtask();
		//
		// System.out.println(" thread setting Starting");
		//
		// System.out.println(" Starting");
		//
		// // Create Thread
		// Thread numbersThread = new Thread(task);
		//
		// // Start Thread
		// numbersThread.start();
		//
		// System.out.println(" thread start setting Finished");
		//
		//

		//////////////////////////////////

		int count = 100;

		while (count > 0) {
			System.out.println("You have " + count + "  chances to do something" + "  Please enter an integer!!");
			count--;

			System.out.println("00  Prepare Flight seat from sratch ");
			System.out.println("11  set prebooked customer a seat! ");
			System.out.println("22  customer registration");
			System.out.println("33  search flight ");
			System.out.println("44  choose food");
			System.out.println("55  compute cost for flight");
			System.out.println("66  computer total income for company");
			System.out.println("77  change booking through bookid ");
			System.out.println("88  Save all information!!!! ");
			System.out.println("99  Load file with saved data to start ");
			System.out.println("100  end thread");
			System.out.println("110  start thread check state every 15 seconds");
			sc = new Scanner(System.in);

			String usrInput9 = sc.nextLine();
			usertitle = new Scanner(System.in);
			//////////////////////////////////////////////////////////////////////////////////////////
			switch (usrInput9) {

			case "00":
				System.out.println("Do you right to be admin?");
				String input55 = "00";
				System.out.println("Please type in 'yes' or 'no' !!!!");

				input55 = usertitle.nextLine();
				if (input55.equals("no")) {
					break;
				}

				// if (input55.equals("yes"))
				String pass = "00";
				while (!(pass.equals("admin"))) {

					System.out.print("Enter your Password:");
					pass = usertitle.nextLine();
				}

				System.out.println("Warnning!!!!!!!!This is  Prepare Flight seat food from sratch!!!!!!!!!");

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
							seatlist.getSeat().add(stempo);
							System.out.println("SeatID number: " + stempo.seatid);
							System.out.println(stempo);

						}

					}
				}
				System.out.println(" All flights  " + seatlist.getSeat().size() + "   seats  is ready!");
				/////////////////////////////////////////////////

				//////////////////////////////////////////////////////////
				break;

			case "11":

				System.out.println("This is   11  set prebooked customer a seat!");
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// int free = 1;
				// while (free == 1) {
				for (Customer temp : customerlist2) {
					// System.out.println("customer1-9 AAAAAAAAAAAAAAAAAAAAA!");

					for (int kk = 0; (kk + 1) <= seatlist.getSeat().size(); kk++)

					{
						// System.out.println("find seats for customer
						// BBBBBBBBBBBBBBBBBBBBB!");

						if (seatlist.getSeat().get(kk).getBooked() == false)

						{

							// System.out.println("Now
							// BOOOOOOOOOOOOOOOOOOOOOOOOOOOOObook!!");
							seatlist.getSeat().get(kk).booked = true;

							System.out.println("Seat ID number:" + seatlist.getSeat().get(kk).seatid);

							System.out.println(seatlist.getSeat().get(kk));
							System.out.println(" one prebooked customer flight is booked");

							int istt = (int) (new Date().getTime() / 1000
									+ ThreadLocalRandom.current().nextInt(0, 999 + 1));

							System.out.println("This  book ID  is " + istt);
							String ist = Integer.toString(istt);

							BookItem prepbooked = new BookItem(ist, temp,
									foodlist.food.get(ThreadLocalRandom.current().nextInt(0, 6 + 1)),
									seatlist.getSeat().get(kk));
							booklist.getBookitem().add(prepbooked);
							System.out.println("booklist is added!");

							System.out.println("Total booking item number:   " + booklist.getBookitem().size());

							System.out.println(prepbooked);

							break;
						}

						if (booklist.getBookitem().size() == seatlist.getSeat().size())

						{
							System.out.println("full booked! add more airplane");
							break;
						}

					}

				}
				// }

				System.out.println(booklist);

				System.out.println("For prebooked customer booking is finished!!");

				break;
			case "22":

				System.out.println("This is   customer registration!!!!!!");

				String input22 = "22";

				while (!input22.equals("yes") || !input22.equals("no")) {
					System.out.println("Are you already registered customer ? Please type in 'yes'  or 'no'.");
					usertitle = new Scanner(System.in);
					input22 = usertitle.nextLine();
					//////////////////////////////////////////////////////////////
					if (input22.equals("yes")) {
						System.out.println(
								"Are you already registered customer ? Please type in Your customer_ID_number!");

						String inputid = usertitle.nextLine();
						for (Customer temp : customerlist2) {
							if (inputid.equals(temp.getCustomerNumber()))

							{
								System.out.println(temp);
								System.out.println("Above registration is yours. Please comtinue your booking!");
								customertemp = temp;
							}
						}

						break;
					}
					//////////////////////////////////////////////////////////////////////
					System.out.println(
							"Do you want to register? Please type in 'yes' to register or 'no' to search flight.");

					input22 = usertitle.nextLine();
					if (input22.equals("no")) {
						break;
					}

					if (input22.equals("yes"))

					{
						String Title;
						System.out.print("Enter your Title: ");
						Title = usertitle.nextLine();
						System.out.print(" your Title: " + Title + "   is saved.");
						String first_name;
						System.out.print("Enter your first name: ");
						first_name = usertitle.nextLine();
						System.out.print(" first_name: " + first_name + "   is saved.");
						String family_name;
						System.out.print("Enter your family name: ");
						family_name = usertitle.nextLine();
						System.out.print(" family_name: " + family_name + "   is saved.");

						String adress;
						System.out.print("Enter your Adress: ");
						adress = usertitle.nextLine();
						System.out.print(" Adress: " + adress + "   is saved.");

						String telephone;
						System.out.print("Enter your Telephone number");
						telephone = usertitle.nextLine();
						System.out.print(" telephone: " + telephone + "   is saved.");
						String email;
						System.out.print("Enter your Email");
						email = usertitle.nextLine();
						System.out.print(" email: " + email + "   is saved.");
						String input2 = "22";
						GenderType gender = null;
						while (!input2.equals("yes")) {
							System.out.println("Are you Male? Please type in 'yes'  or 'no'.");

							input2 = usertitle.nextLine();

							if (input2.equals("yes")) {
								gender = GenderType.MALE;
								System.out.print("You are Male! registered.");
								break;
							}

							System.out.println("Are you Female? Please type in 'yes'  or 'no'.");

							input2 = usertitle.nextLine();

							if (input2.equals("yes")) {
								gender = GenderType.FEMALE;
								System.out.print("You are Female! registered.");
								break;
							}

						}
						int istt = (int) (new Date().getTime() / 1000);

						System.out.println("This is " + istt);
						String ist = Integer.toString(istt);
						customertemp = new Customer(Title, first_name, family_name, adress, telephone, email, ist,
								gender);

						customerlist.add(customertemp);
						System.out.println(customertemp);
						System.out.print("You are  registered now.");
					break;

					}

				}

				// if (!(seattemp == null)) {
				// break;
				// }
				//
				// break;
			case "33":
				System.out.println(" All flights  " + seatlist.getSeat().size() + "   seats  is ready!");
				System.out.println("This is    search flight  and  food!!!!!!!!!");
				String searchItem = "no";
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

					userinput = new Scanner(System.in);

					searchItem = userinput.next();
					if (searchItem.equals("ok"))
						break;
					int i3 = 0, i4 = 0;
					for (int kk = 0; (kk + 1) <= seatlist.getSeat().size(); kk++)

					{

						if (seatlist.getSeat().get(kk).flightname.equals(searchItem)
								&& seatlist.getSeat().get(kk).booked == false)

						{
							System.out.println("Seat ID number:" + seatlist.getSeat().get(kk).seatid);
							System.out.println(seatlist.getSeat().get(kk));

							i3++;
							if (seatlist.getSeat().get(kk).getFirstclass() == true) {
								i4++;
							}

						}

					}
					System.out.println(
							"There are  " + i3 + "   seats you can choose. " + i4 + " of them are First Class!");
					System.out.println("Remember seatID number and input 'ok' to  book!");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				int myint2 = 10000;

				do {
					sc2 = new Scanner(System.in);
					try {
						System.out.println("Please input your Seat ID number, which you want book!");

						// nextInt will throw InputMismatchException
						// if the next token does not match the Integer
						// regular expression, or is out of range

						int usrInput = sc2.nextInt();
						myint2 = usrInput;
					} catch (InputMismatchException exception) {
						// Print "This is not an integer"
						// when user put other than integer

						System.out.println("This is not an integer");
					}
				} while (myint2 < 1 || myint2 > 3000);

				System.out.println("This is  an  OK  integer");

				if (seatlist.getSeat().get((myint2 - 1)).booked == false) {

					seatlist.getSeat().get((myint2 - 1)).booked = true;
					System.out.println("Your flight is booked");
					seattemp=seatlist.getSeat().get((myint2 - 1));
				}
				System.out.println(seatlist.getSeat().get((myint2 - 1)));
				System.out.println("Pleasse choose food or seardh flights, if  alldone goto 55 for your ticket");

				// if (customertemp == null) {
				// break;
				//
				// }

				////////////////////////////// food//////////////////////////////////

			case "44":

				System.out.println("Du you want book food or 'no food'?  input your  food number!!");

				for (int i4 = 0; i4 < foodlist.getFood().size(); i4++) {

					System.out.println(foodlist.food.get(i4));

				}

				System.out.println("Du you want book food?  input your  food number!!");
				int myintfood = 100;

				do {
					@SuppressWarnings("resource")
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

				foodtemp = new Food(55, "AAA", 00, false);
				if (myintfood == 0) {

					foodtemp = foodlist.getFood().get(0);
				}
				if (myintfood == 1) {

					foodtemp = foodlist.getFood().get(1);
				}
				if (myintfood == 2) {

					foodtemp = foodlist.getFood().get(2);
				}
				if (myintfood == 3) {

					foodtemp = foodlist.getFood().get(3);
				}

				if (myintfood == 4) {

					foodtemp = foodlist.getFood().get(4);
				}

				if (myintfood == 5) {

					foodtemp = foodlist.getFood().get(5);
				}

				if (myintfood == 6) {

					foodtemp = foodlist.getFood().get(6);
				}

				System.out.println("Food   " + foodtemp + "   is your choice!  Confirmed!");
				

				

			 if (customertemp == null || seattemp == null) {
				break;
		
			}

			case "55":
				System.out.println("This is  an   compute cost for  the customer to make payment!!!!!!!!!!!!");

				System.out.println(foodtemp);
				System.out.println(seattemp);
				System.out.println(customertemp);
				if (foodtemp == null) {
					System.out.println("You have not choose food yet! go to 44 to register");
					break;

				}

				if (seattemp == null) {
					System.out.println("You have not choose 'flight and seat' yet! go to 33 to register. Then back");
					break;

				}
				if (customertemp == null) {
					System.out.println("You have not registered yet! go to 22 to register. Then back");
					break;

				}

				int istt5 = (int) (new Date().getTime() / 1000);
				System.out.println("This is " + istt5);
				String ist5 = Integer.toString(istt5);

				BookItem booktemp = new BookItem(ist5, customertemp, foodtemp, seattemp);
				System.out.println("Book is finnished!");
				foodtemp = null;customertemp=null;seattemp=null;
				booklist.getBookitem().add(booktemp);
				System.out.println(booktemp);
				System.out.println("booklist is added!");
				 double cost;
				 cost=booktemp.getFood().foodprice+booktemp.getSeat().value;
			 

				System.out.println("Total cost for you is :"+cost);
				// for (int i5=0;i5<booklist.bookitem.size(); i5++)
				// {
				//
				//
				// System.out.println(booklist.bookitem.get(i5).getCustomerNumber());
				//
				//
				// }
				//
				break;
			case "66":

				for (BookItem temp66 : booklist.getBookitem()) {

					income = income + temp66.getSeat().value + temp66.getFood().foodprice;

				}

				System.out.println("Total Booking number =  " + booklist.getBookitem().size());
				System.out.println("Total Income =  " + income);
				System.out.println("Total Profit =  " + income * 0.3);

				break;

			case "77":

				System.out.println("This is  an  change booking through bookid!!!!!!!!!");

				String tempid;
				String delete;
				System.out.println("Please input your bookingID");
				usertitle = new Scanner(System.in);
				tempid = usertitle.nextLine();

				for (BookItem temp : booklist.getBookitem()) {

					if (temp.BookingID.equals(tempid)) {
						System.out.println("Item founded.      du you want delet?    input 'yes' to delete booking");
						delete = usertitle.nextLine();

						if (delete.equals("yes")) {
							temp.getSeat().booked = false;
							booklist.getBookitem().remove(temp);
							System.out.println(temp);
							System.out.println("is already  deleted!");
							break;
						}

					}

				}

			case "88":

				System.out.println("This is  Save!!!!!!!!!!");

				try

				{
					XMLIO.saveObject("seatlist.xml", seatlist);
					XMLIO.saveObject("foodlist.xml", foodlist);
					// XMLIO.saveObject("flightlist.xml", flightlist);
					XMLIO.saveObject("customerlist.xml", customerlist);
					System.out.println("list.xml Saved Succesfully");
					break;
				}

				catch (IOException ex) {
					Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

					break;
				}

			case "99":

			{
				
				// Loading with XmlIO, in this case the file might be missing.
				try {
					seatlist = XMLIO.loadObject("seatlist.xml", SeatList.class);// SeatList.class

					foodlist = XMLIO.loadObject("foodlist.xml", FoodList.class);

					customerlist = XMLIO.loadObject("customerlist.xml", CustomerList.class);

				} catch (IOException ex) {
					System.out.println("Could not load xml");
				}
				// break;
			}

				break;
			case "110": {
				Threadtask.stop = false;
				// Runnable Object
				Threadtask task = new Threadtask();

				System.out.println(" thread setting  Starting");

				System.out.println("   Starting");

				// Create Thread
				Thread numbersThread = new Thread(task);

				// Start Thread
				numbersThread.start();

				System.out.println(" thread start setting  Finished");

			}
				break;

			case "100": {
				Threadtask.stop = true;

			}
				break;

			}

		}

	}
}
