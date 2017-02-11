import java.util.*;
public class PresentValueCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double present, future, annualInterest, numYears;
		future = 10000;
		System.out.print("For how many years will your money be sitting in the account? ");
		numYears = scan.nextDouble();
		scan.nextLine();
		while (numYears <= 0) {
			System.out.println("The number of years you have money in the account must be greater than 0.");
			System.out.print("For how many years will your money be sitting in the account? ");
			numYears = scan.nextDouble();
			scan.nextLine();
		}
		System.out.print("What is the annual interest rate of your account? ");
		annualInterest = scan.nextDouble();
		scan.nextLine();
		while (annualInterest < 0) {
			System.out.println("Your annual interest rate must be a positive number.");
			System.out.print("What is the annual interest rate of your account? ");
			annualInterest = scan.nextDouble();
			scan.nextLine();
		}
		System.out.printf("How much money would you like to end up with in your account after %.0f years.", numYears);
		System.out.println();
		System.out.print("$ ");
		future = scan.nextDouble();
		scan.nextLine();
		while (future <= 0) {
			System.out.println("The desired amount in your account must be greater than 0.");
			System.out.printf("How much money would you like to end up with in your account after %.0f years.", numYears);
			System.out.println();
			System.out.print("$ ");
			future = scan.nextDouble();
			scan.nextLine();
		}
		present = presentValue(future, annualInterest, numYears);
		System.out.printf("In order to end up with $%,.2f in your account at the end of %.0f years, ", future, numYears);
		System.out.printf("you will need to deposit $%,.2f today.", present);
		System.out.println();
	} //end of main method
	
	/**
		The presentValue method calculates how much money you would need to deposit today
		to have a certain amount of by the end of n years when the drawing x annual interest.
		
		@param future The desired amount of money at the end of the given time period.
		@param interest The annual interest rate of the account.
		@param numYears The number of years the money will sit in the account.
		@return presentValue The money you will need to deposit today in order to collect your desired amount.
	*/
	
	public static double presentValue(double future, double interest, double numYears) {
		double presentValue;
		double denominator;
		denominator = 1 + interest;
		denominator = Math.pow(denominator, numYears);
		presentValue = future / denominator;
		return presentValue;
	}
	
} //end of PresentValue class