package ggg;

import java.util.Scanner;

public class allinoneGuessNumber {
	private int nr;
	private int trytime;
	
	
	public void setNr(int nr) {
		this.nr = nr;
	}




	public void setTrytime(int trytime) {
		this.trytime = trytime;
	}




	public void runGame()
	
	{

		// TODO Auto-generated method stub
		int randomNum = 1 + (int) (Math.random() * nr);

		int n = 0;
		int myint;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Guess  an integer  1 to  "+ nr);
			System.out.println("");
			myint = keyboard.nextInt();
			if (myint - randomNum == 0)
				break;

			n++;
			if (myint < randomNum)

				System.out.println("Fel!   "+myint+"   is too small!   Your have tried  " + n + "  times");

			if (myint > randomNum)
				System.out.println("Fel!  "+myint+"   is  too big!  Your have tried  " + n + "  times");
		} while (myint - randomNum != 0);
		System.out.println("Rätt!" + "Your have tried   " + (++n) + "  times");
	}

	
	

	public static void main(String[] args) {
		
	      int mint;
		  Scanner keyboard = new Scanner(System.in);
		    System.out.println("It ia a game , that you can guess a number from 0 to "
		    		+ "the number you defined youself."
		    		+ "Please enter an integer  bigger than 2 ");
		  
		     mint = keyboard.nextInt();
		     
		     allinoneGuessNumber guess= new allinoneGuessNumber();
		     guess.setNr(mint);
		     guess.runGame();
		
	}

	
	
	
}