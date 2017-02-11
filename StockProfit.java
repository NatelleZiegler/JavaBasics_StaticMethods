import java.util.*;
public class StockProfit {
	public static void main(String[] args) {
		double NS, PP, PC, SP, SC;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of shares you would like to purchase: ");
		NS = scan.nextDouble();
		scan.nextLine();
		
		while (NS < 0) {
			System.out.println("You must purchase a positive number of shares.");
			System.out.print("Please enter the number of shares you would like to purchase: ");
			NS = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What is the purchase price per share?");
		System.out.print("$ ");
		PP = scan.nextDouble();
		scan.nextLine();
		
		while (PP < 0) {
			System.out.println("The purchase price per share must be a positive number.");
			System.out.println("What is the purchase price per share?");
			System.out.print("$ ");
			PP = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What is the purchase commission that is being paid?");
		System.out.print("$ ");
		PC = scan.nextDouble();
		scan.nextLine();
		
		while (PC < 0) {
			System.out.println("The purchase commission must be a positive number.");
			System.out.println("What is the purchase commission that is being paid?");
			System.out.print("$ ");
			PC = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What is the sale price per share?");
		System.out.print("$ ");
		SP = scan.nextDouble();
		scan.nextLine();
		
		while (SP < 0) {
			System.out.println("The sale price per share must be a positive number.");
			System.out.println("What is the sale price per share?");
			System.out.print("$ ");
			SP = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("What is the sale commission?");
		System.out.print("$ ");
		SC = scan.nextDouble();
		scan.nextLine();
		
		while (SC < 0) {
			System.out.println("The sale commission must be a positive number.");
			System.out.println("What is the sale commission?");
			System.out.print("$ ");
			SC = scan.nextDouble();
			scan.nextLine();
		}
		
		double profit;
		profit = getProfit(NS, PP, PC, SP, SC);
		if (profit >= 0) {
			System.out.printf("The profit on the sale was $%,.2f", profit);
			System.out.println();
		}
		else {
			profit *= -1;
			System.out.printf("The loss on the sale was $%,.2f", profit);
			System.out.println();
		}
	}
	
	/**
		The getProfit method calculates the profit from the sale of a stock.
		
		@param shares The number of shares
		@param price The purchase price per share
		@param commission The purchase commission paid
		@param sale The sale price per share
		@param saleCommission The sale commission paid
		@return profit The profit from the sale of a stock
	*/
	
	public static double getProfit(double shares, double price, double commission, double sale, double saleCommission) {
		double profit;
		profit = ((shares * sale) - saleCommission) - ((shares * price) + commission);
		return profit;
	}
}