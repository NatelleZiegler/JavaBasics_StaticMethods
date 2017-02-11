import java.util.*;
public class RockPaperScissors {
	public static void main(String [] args) {
		
		boolean gameEnd;
		
		do {
		
		int compChoice = getChoice();
		int userChoice = showMenu();
		showUserChoice(userChoice);
		showCompChoice(compChoice);
		gameEnd = isWinner(compChoice, userChoice);		
		
		} while (gameEnd != true);
	}
	
	/**
		The getChoice method generates a random number that represents the computer's 
		choice in a game of rock, paper, scissors.
		
		@return compChoice A number representing the computer's selection 
		(1 = rock, 2 = paper, 3 = scissors).
	*/
	
	public static int getChoice() {
		Random rand = new Random();
		int compChoice;
		compChoice = rand.nextInt(3) + 1;
		return compChoice;
	}
	
	/**
		The showMenu method displays a menu onscreen that presents the instructions to the user.
		The user then selects an option from the menu. The user's choice is stored as an integer.
		
		@return userSelect A selection from the user that corresponds with a choice on the menu.
	*/
	
	public static int showMenu() {
		System.out.println("Please make a selection from the following menu by entering a number from 1-3.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		Scanner scan = new Scanner(System.in);
		int userSelect;
		userSelect = scan.nextInt();
		scan.nextLine();
		while (userSelect < 1 || userSelect > 3) {
			System.out.println("Enter a number from 1-3.");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			userSelect = scan.nextInt();
			scan.nextLine();
		}
		return userSelect;
	}
	
	/**
		The showCompChoice method displays the computer's choice in a game of rock, paper, scissors.
		
		@param choice A number from 1-3 that corresponds with rock, paper, or scissors.
	*/
	
	public static void showCompChoice(int choice) {
		switch(choice) {
			case 1:
				System.out.println("The computer chose rock.");
			break;
			case 2:
				System.out.println("The computer chose paper.");
			break;
			case 3:
				System.out.println("The computer chose scissors.");
			break;
			default:
				System.out.println("Error.");
			}
		}
		
	/**
		The showUserChoice method displays the user's choice in a game of rock, paper, scissors.
		
		@param choice A number from 1-3 that corresponds with rock, paper, or scissors.
	*/
		
	public static void showUserChoice(int choice) {
		switch(choice) {
			case 1:
				System.out.println("You chose rock.");
			break;
			case 2:
				System.out.println("You chose paper.");
			break;
			case 3:
				System.out.println("You chose scissors.");
			break;
			default:
				System.out.println("Error.");
		}
	}
		
		/**
			The isWinner method tests whether or not a winner can be determined.
			If these is no winner (in the case of a tie), the method returns false.
			
			@param compChoice The computer's selection.
			@param The user's selection.
			@return A boolean value that indicates whether or not a winner was determinable.
		*/
		
		public static boolean isWinner(int compChoice, int userChoice) {
			boolean isWinner;
			if (compChoice == 1) { //computer selected rock
				if (userChoice == 1) { //user selected rock
					System.out.println("There was a tie. Play again to determine winner.");
					isWinner = false;
				}
				else if (userChoice == 2) { //user selected paper
					System.out.println("You won the game.");
					isWinner = true;
				}
				else { //user selected scissors
					System.out.println("The computer won the game.");
					isWinner = true;
				}
			}
			else if (compChoice == 2) { //computer selected paper
				if (userChoice == 1) { //user selected rock
					System.out.println("The computer won the game.");
					isWinner = true;
				}
				else if(userChoice == 2) { //the user selected paper
					System.out.println("There was a tie. Play again to determine winner.");
					isWinner = false;
				}
				else { //user selected scissors
					System.out.println("You won the game.");
					isWinner = true;
				}
			}
			else { //computer selected scissors
				if (userChoice ==1) { //user selected rock
					System.out.println("You won the game.");
					isWinner = true;
				}
				else if (userChoice == 2) { //user selected paper
					System.out.println("The computer won the game.");
					isWinner = true;
				}
				else { //user selected scissors
					System.out.println("There was a tie. Play again to determine winner.");
					isWinner = false;
				}
			}
			return isWinner;
		}
	}
	