import java.util.*;
public class ConversionProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int meters;
		int selection;
		System.out.print("Please enter a distance in meters: ");
		meters = scan.nextInt();
		scan.nextLine();
		
		while (meters < 0) {
			System.out.println("Please do not select a negative number of meters.");
			System.out.print("Please enter a distance in meters: ");
			meters = scan.nextInt();
			scan.nextLine();
		}
		
		do {
			menu();
			
			selection = scan.nextInt();
			scan.nextLine();
			
			switch (selection) {
				case 1:
					showKilometers(meters);
				break;
				case 2:
					showInches(meters);
				break;
				case 3:
					showFeet(meters);
				break;
				case 4:
				break;
				default:
					System.out.println("Please enter a valid selection.");
			}
		} while (selection != 4);
	}
	
	/**
		The showKilometers method converts a measurement in meters to kilometers
		and displays the result.
		
		@param meters A measurement in meters
	*/
	
	public static void showKilometers(int meters) {
		double kilos;
		kilos = meters * 0.001;
		System.out.printf("%d meters is equivalent to %,.2f kilometers.", meters, kilos);
		System.out.println();
	}
	
	/**
		The showInches method converts a measurement in meters to inches and displays the 
		result.
		
		@param meters A measurement in meters
	*/
	
	public static void showInches(int meters) {
		double inches;
		inches = meters * 39.37;
		System.out.printf("%d meters is equivalent to %,.2f inches.", meters, inches);
		System.out.println();
	}
	
	/**
		The showFeet method converts a measurement in meters to feet and
		displays the result.
		
		@param meters A measurement in meters.
	*/
	
	public static void showFeet(int meters) {
		double feet;
		feet = meters * 3.281;
		System.out.printf("%d meters is equivalent to %,.2f feet.", meters, feet);
		System.out.println();
	}
	
	/**
		The menu method displays a menu
	*/
	
	public static void menu() {
		System.out.println("Please enter a number from 1-4 to make a selection from the following menu: ");
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}
}
	