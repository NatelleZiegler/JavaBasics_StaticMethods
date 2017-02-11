import java.util.*;
public class CharMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String thing;
		int place;
		
		System.out.println("Please enter a word or a sentence.");
		thing = scan.nextLine();
		
		System.out.println("Please enter an integer.");
		place = scan.nextInt();
		scan.nextLine();
		
		int stringSize = thing.length();
		
		while (place >= stringSize || place < 0) {
			if (place >= stringSize) {
				System.out.println("Please enter a smaller number.");
			}
			else {
				System.out.println("Please enter a larger number.");
			}
			place = scan.nextInt();
			scan.nextLine();
		}
		
		showChar(thing, place);
	}
	
	/**
		The showChar method displays the character located at a user-specified
		portion of the inputed String.
		@param line The user-inputed String
		@param position a number representing a location within line
	*/
	
	public static void showChar(String line, int position) {
		char character;
		character = line.charAt(position);
		System.out.println(character);
	}
}