package randomquotes;

import java.util.Random;
import java.util.Scanner;

public class Quotes {

	public static void main(String[] args) {
		// 2D Array for bible verse and author page
		String[][] bibleQuotes = {
				{ "Do nothing from rivalry or conceit, but in humility count"
						+ " others more significant than yourselves", "Philippians 2:3" },
				{ "Do you see a man who is wise in his own eyes?" + "There is more hope for a fool than for him.",
						"Proverbs 26:12" },
				{ "Blessed is the man whom you discipline, O Lord" + "and whom you teach out of your law,\n"
						+ "to  give him rest from days of trouble," + "until a pit is dug for the wicked.",
						"Psalm 94:12-13" },
				{ "And I will ask the Father, and he will give you another Helper, "
						+ " to be with you forever, 17 even the Spirit of truth, \n"
						+ "whom the world cannot receive, because it neither sees him nor knows him."
						+ " You know him, for he dwells with you and will be in you.", "John 14:16-17" } };

		int quoteCounter = bibleQuotes.length; // Counts quote array


		//Scanner object to request input from user
		Scanner reader = new Scanner(System.in); //

		String userInput;
		
		do
		{
			//Random number generator from 1 to n.
			Random randomGen = new Random();
			int randomNum = (Math.abs(randomGen.nextInt()));
			randomNum %= quoteCounter;
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
