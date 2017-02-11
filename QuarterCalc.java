import java.util.*;
public class QuarterCalc {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int quarters;
	double dollars;
	System.out.println("How many quarters do you have?");
	quarters = scan.nextInt();
	scan.nextLine();
	
	dollars = quartersToDollars(quarters);
	System.out.printf("You have $%.2f.", dollars);
	System.out.println();
	}
	
	public static double quartersToDollars(int numQuart) {
		double numDollars;
		numDollars = (double)numQuart / 4;
		return numDollars;
	}
}