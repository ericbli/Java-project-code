package newtodolist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		List<ListItem> listitems = new ArrayList();

		int count100 = 10;
		while (count100 > 0) {
			System.out.println("You have " + count100 + "  chances to do something" + "  Please enter an integer!!");
			count100--;
			System.out.println("1  Adding todo items");
			System.out.println("2  Marking a todo item as done");
			System.out.println("3  Remove a todo item");
			System.out.println("4  Remove all done todo items");
			System.out.println("5  Search for todo items");
			System.out.println("6  Edit todo items");
			
			System.out.println("7  Mark todo items as not done ");
			System.out.println("8  Save ");
			System.out.println("9  Load file ");
			int myint = 100;

			do {
				Scanner sc = new Scanner(System.in);
				try {
					System.out.println("Please input an  right integer from  1   to    9");
					// nextInt will throw InputMismatchException
					// if the next token does not match the Integer
					// regular expression, or is out of range

					int usrInput = sc.nextInt();
					myint = usrInput;
				} catch (InputMismatchException exception) {
					// Print "This is not an integer"
					// when user put other than integer

					System.out.println("This is not an integer");
				}
			} while (myint < 1 || myint > 9);

			System.out.println("This is  an  OK  integer");
			switch (myint) {
			////////////////////////////////////////
			case 1:

				Scanner user_input = new Scanner(System.in);

				int count = 0;
				while (count < 100) {
					System.out.print("Enter your  List Item:        and input text" + "'ok'"
							+ "to  end action and list all to do items to you! ");

					String item = user_input.nextLine();
					if (item.equals("ok"))
						break;
					ListItem tempItem = new ListItem(item, false);
					listitems.add(tempItem);
					count++;
				}

				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);
				break;
			///////////////////////////////////////////////////////
			case 2:
				int count2 = 0;
				while (count2 < listitems.size()) {
					// for (int i = 0; i < listitems.size(); i++) {

					System.out.print("Enter your all  done Items  and input text" + "'ok'"
							+ "to  end action and list all to do items to you!  ");
					Scanner user_input1 = new Scanner(System.in);
					String itemdone = user_input1.nextLine();

					if (itemdone.equals("ok"))
						break;

					for (int j = 0; j < listitems.size(); j++) {

						if (listitems.get(j).getTask().equals(itemdone)) // judge

						{

							listitems.get(j).setDone(true);// change boolean
						}

					}
				}

				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);
				break;
			////////////////// Remove items//////////////////////////////
			case 3:
				for (int k = 0; k < listitems.size(); k++) {

					System.out.print("Enter 'item' to delete  item!  and input text" + "'ok'"
							+ "to  end action and list all to do list items to you!  ");
					Scanner user_input2 = new Scanner(System.in);

					String deletealldone = user_input2.nextLine();
					if (deletealldone.equals("ok"))
						break;
					for (int i = 0; i < listitems.size(); i++) {
						if (deletealldone != null && !deletealldone.isEmpty()
								&& (listitems.get(i).getTask().equals(deletealldone))) // judge

						{

							listitems.remove(i);

						}

					}

				}
				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);
				break;
			////////////////// Remove all done
			////////////////// items//////////////////////////////

			case 4:

				// System.out.print("Enter 'yes' to delete all done items! 'no'
				// to regret!!!");
				//
				// Scanner user_input4 = new Scanner(System.in);
				//
				// String deletealldone = user_input4.nextLine();
				// if (deletealldone.equals("no"))
				// break;
				// if (deletealldone.equals("yes")) {

				for (int t = listitems.size() - 1; t >= 0; t--) {
					if (listitems.get(t).isDone() == true) // judge

					{
						// System.out.println(listitems.get(t).toString());
						listitems.remove(t);

					}

				}

				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);

				break;

			//////////////////////////////////

			case 5:

				int count5 = 0;
				while (count5 < 100) {
					count5++;
					System.out.print("Enter item you want search to and  'ok' end search  ");

					Scanner user_input3 = new Scanner(System.in);

					String itemsearch = user_input3.nextLine();

					if (itemsearch.equals("ok"))
						break;

					String is = "is 'not'";
					for (int i = 0; i < listitems.size(); i++) {

						if (listitems.get(i).getTask().equals(itemsearch)) {
							is = "is";
							break;
						}
					}

					System.out.println(itemsearch+"----------------" + is + "  in to do list!");

				}

				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);

				break;
			//////////////////////////////////

			case 6:

				for (int k = 0; k < listitems.size(); k++) {

					System.out.print("Enter 'item' to edit the  item!  and input text" + "'ok'"
							+ "to  end action and list all to do list items to you!  ");
					Scanner user_input2 = new Scanner(System.in);

					String deletealldone = user_input2.nextLine();
					if (deletealldone.equals("ok"))
						break;
					for (int i = 0; i < listitems.size(); i++) {
						if (deletealldone != null && !deletealldone.isEmpty()
								&& (listitems.get(i).getTask().equals(deletealldone))) // judge

						{
							System.out.print("Please enter new text , it will take away the original item!  "
									+ "to  end action and list all to do list items to you!  ");
							Scanner user_input6 = new Scanner(System.in);
							String item6 = user_input6.nextLine();
							listitems.get(i).setTask(item6);

						}

					}

				}
				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);
				break;
			///////////////

			///////////// Mark  done todo items as not done///////////

			case 7:
				
			
				int count7 = 0;
				while (count7 < listitems.size()) {
					// for (int i = 0; i < listitems.size(); i++) {

					System.out.print("Enter your   done Items  and input text" + "'ok'"
							+ "to  end action and list all to do items to you!  ");
					Scanner user_input1 = new Scanner(System.in);
					String itemdone7 = user_input1.nextLine();

					if (itemdone7.equals("ok"))
						break;

					for (int j = 0; j < listitems.size(); j++) {

						if (listitems.get(j).getTask().equals(itemdone7)) // judge

						{

							listitems.get(j).setDone(false);// change boolean
						}

					}
				}

				////////////////////////////////////////

				for (ListItem next : listitems)
					System.out.println(next);
				break;	
				
////////////////////////////////////////
				
				
				
				
				
				
				

			case 100:
				break;

			}

		}
	}
}