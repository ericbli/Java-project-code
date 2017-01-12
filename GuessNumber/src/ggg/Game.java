package ggg;

import java.util.Scanner;

public class Game {

	
	public static void main(String[] args) {
		
	      int mint;
		  Scanner keyboard = new Scanner(System.in);
		    System.out.println("It ia a game , that you can guess a number from 0 to "
		    		+ "the number you defined youself."
		    		+ "Please enter an integer  bigger than 2 ");
		  
		     mint = keyboard.nextInt();
		     
		     Rungame guess= new Rungame();
		     guess.setNr(mint);
		     guess.runGame();
		     System.out.println(" Very Good! ");
	}

}