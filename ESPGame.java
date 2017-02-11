import java.util.*;
public class ESPGame {
	public static void main(String [] args) {
		int totalWins = 0;
		int totalLoss = 0;
		System.out.println("Are you psychic? This program will test your extrasensory perception.");
		System.out.println("The computer will select a color and you must try to guess what that color is.");
		for (int count = 1; count <= 10; count++) {
			int compColor; //A number representing the computer's selection
			compColor = numGet();
			int userColor;
			userColor = userGuess();
			revealRandomColor(compColor);
			boolean win;
			win = testGuess(compColor, userColor);
			if (win == true) {
				totalWins += 1;
			}
			else {
				totalLoss += 1;
			}
		} //end of for loop
		
		System.out.println("You guessed correctly " + totalWins + " times.");
		System.out.println("You guessed incorrectly " + totalLoss + " times.");
		if (totalWins < totalLoss) {
			System.out.println("Your ESP is shit.");
		}
		else if (totalWins > totalLoss) {
			System.out.println("You have a gift!");
		}
		else {
			//wins and losses are equal
		}
	} //end of main method
	
	/**
		The numGet method selects a random number between 0 and 4.
		
		@return randomNum a random integer between 0 and 4.
	*/
	
	public static int numGet() {
		Random rand = new Random();
		int randomNum = rand.nextInt(5);
		return randomNum;
	}
	
	/**
		The userGuess method presents the user with a menu from which they can select an item.
		
		@return guess An integer between 0 - 4 that represents an item on the list.
	*/
	
	public static int userGuess() {
		Scanner scan = new Scanner(System.in);
		int guess;
		System.out.println("Please guess the color the color the computer has selected by choosing a number 0 - 4:");
		System.out.println("0. Red");
		System.out.println("1. Green");
		System.out.println("2. Blue");
		System.out.println("3. Orange");
		System.out.println("4. Yellow");
		guess = scan.nextInt();
		scan.nextLine();
		while (guess < 0 || guess > 4) {
			System.out.println("Please make a valid selection from the menu by selecting a number from 0 - 4:");
			System.out.println("0. Red");
			System.out.println("1. Green");
			System.out.println("2. Blue");
			System.out.println("3. Orange");
			System.out.println("4. Yellow");
			guess = scan.nextInt();
			scan.nextLine();
		}
		switch (guess) {
		case 0:
			System.out.println("You guessed red.");
		break;
		case 1:
			System.out.println("You guessed green.");
		break;
		case 2:
			System.out.println("You guessed blue.");
		break;
		case 3:
			System.out.println("You guessed orange.");
		break;
		case 4:
			System.out.println("You guessed yellow.");
		break;
		default:
			System.out.println("Error");
		}
		return guess;
	}
	
	/**
		The revealRandomColor reveals to the user the color that the computer has 
		randomly selected.
	*/
	
	public static void revealRandomColor(int randomNum) {
		switch (randomNum) {
			case 0:
				System.out.println("The computer guessed red.");
			break;
			case 1:
				System.out.println("The computer guessed green.");
			break;
			case 2:
				System.out.println("The computer guessed blue.");
			break;
			case 3:
				System.out.println("The computer guessed orange.");
			break;
			case 4:
				System.out.println("The computer guessed yellow.");
			break;
			default:
				System.out.println("Error");
		}
	}
	
	/**
		The testGuess method tests whether or not the user has won the game.
		
		@param compGuess The color, represented by an int, that the computer guessed
		@param userGuess The color, represented by an int, that the user has guessed
		@return userWin A boolean value that is true if the user guessed correctly
	*/
	
	public static boolean testGuess(int compGuess, int userGuess) {
		boolean userWin;
		if (compGuess == userGuess) {
			userWin = true;
		}
		else {
			userWin = false;
		}
		return userWin;
	}
	
} //end of ESP class