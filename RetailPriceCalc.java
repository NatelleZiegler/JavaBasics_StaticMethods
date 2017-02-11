import java.util.*;
public class RetailPriceCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double wholesale, markup;
		
		System.out.println("Please enter the wholesale cost of the item.");
		System.out.print("$");
		wholesale = scan.nextDouble();
		scan.nextLine();
		
		while (wholesale <= 0) {
			System.out.println("The wholesale cost of your item must be greater than zero.");
			System.out.println("Please enter the wholesale cost of the item.");
			System.out.print("$");
			wholesale = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What is the markup percentage of the item?");
		System.out.println("Please enter your percentage as a decimal.");
		markup = scan.nextDouble();
		scan.nextLine();
		
		while (markup <= 0) {
			System.out.println("The markup of your item must be greater than zero.");
			System.out.println("Please enter a valid markup amount.");
			markup = scan.nextDouble();
			scan.nextLine();
		}
		
		double retailPrice;
		retailPrice = calculateRetail(wholesale, markup);
		System.out.printf("The retail price of your item is $%.2f", retailPrice);
		System.out.println();
		
	} //close main method
	
	/**
		The calculateRetail method returns the retail price of an item to the main method
		@param cost The wholesale cost of the item
		@param up The markup percentage of the item
		@return retail The retail price of the item
		
	*/
			
	public static double calculateRetail (double cost, double up) {
		double retail;
		retail = cost * up;
		retail = cost + retail;
		return retail;
	}
} //close RetailPriceClac class