package randomquotes;

import java.util.Random;
import java.util.Scanner;

public class Quotes {

	public static void main(String[] args) {
		// 2D Array for bible verse and author page
		String[][] bibleQuotes = BibleVerses.getVerses();

		int verseCounter = bibleQuotes.length; // Counts quote array

		//Scanner object to request input from user
		Scanner reader = new Scanner(System.in); //

		String userInput;
		
		do
		{
			//Random number generator from 1 to n.
			Random randomGen = new Random();
			int randomNum = (Math.abs(randomGen.nextInt()));
			randomNum %= verseCounter;
			int quoteNum = randomNum + 1;
			System.out.println("\n");
			System.out.println(quoteNum + ": " + bibleQuotes[randomNum][0]);
			System.out.println("\t\t - " + bibleQuotes[randomNum][1]);
			
			//Prompt to reload while loop
			System.out.print("\nWould you like to generate another Quote? : 'Yes' or 'No': ");
			userInput = reader.nextLine();
		}
		while (userInput.toLowerCase().contains("y"));
		reader.close(); //Close Scanner object for resource
		System.out.println("\nProgram Terminated! Please RELAUNCH!!\n");
	}

}
