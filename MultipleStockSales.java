import java.util.*;
public class MultipleStockSales {
	public static void main(String[] args) {
		double NS, PP, PC, SP, SC;
		Scanner scan = new Scanner(System.in);
		int numSales; //number of stock sales
		double profit, totalProfit;
		totalProfit = 0;
		
		System.out.print("How many stock sales have you completed: ");
		numSales = scan.nextInt();
		scan.nextLine();
		
		while (numSales < 0) {
			System.out.println("The number of stock sales must be a positive number.");
			System.out.print("How many stock sales have you completed: ");
			numSales = scan.nextInt();
			scan.nextLine();
		}
		
		for (int count = 1; count <= numSales; count++) {
		
			System.out.print("Please enter the number of shares you would like to purchase in sale number " + count + ": ");
			NS = scan.nextDouble();
			scan.nextLine();
		
			while (NS < 0) {
				System.out.println("You must purchase a positive number of shares.");
				System.out.print("Please enter the number of shares you would like to purchase in sale number " + count + ": ");
				NS = scan.nextDouble();
				scan.nextLine();
			}
		
			System.out.println("What is the purchase price per share in stock sale number " + count + "?");
			System.out.print("$ ");
			PP = scan.nextDouble();
			scan.nextLine();
		
			while (PP < 0) {
				System.out.println("The purchase price per share must be a positive number.");
				System.out.println("What is the purchase price per share in stock sale number " + count + "?");
				System.out.print("$ ");
				PP = scan.nextDouble();
				scan.nextLine();
			}
		
			System.out.println("What is the purchase commission that is being paid in stock sale number " + count + "?");
			System.out.print("$ ");
			PC = scan.nextDouble();
			scan.nextLine();
		
			while (PC < 0) {
				System.out.println("The purchase commission must be a positive number.");
				System.out.println("What is the purchase commission that is being paid in stock sale number " + count + "?");
				System.out.print("$ ");
				PC = scan.nextDouble();
				scan.nextLine();
			}
		
			System.out.println("What is the sale price per share in stock sale number " + count + "?");
			System.out.print("$ ");
			SP = scan.nextDouble();
			scan.nextLine();
		
			while (SP < 0) {
				System.out.println("The sale price per share must be a positive number.");
				System.out.println("What is the sale price per share in stock sale number " + count + "?");
				System.out.print("$ ");
				SP = scan.nextDouble();
				scan.nextLine();
			}
		
			System.out.println("What is the sale commission in stock sale number " + count + "?");
			System.out.print("$ ");
			SC = scan.nextDouble();
			scan.nextLine();
		
			while (SC < 0) {
				System.out.println("The sale commission must be a positive number.");
				System.out.println("What is the sale commission in stock sale number " + count + "?");
				System.out.print("$ ");
				SC = scan.nextDouble();
				scan.nextLine();
			}
			
			profit = getProfit(NS, PP, PC, SP, SC);
			totalProfit += profit;

		} //end of for loop
		
		if (totalProfit >= 0) {
			System.out.printf("The profit on the stock sales was $%,.2f", totalProfit);
			System.out.println();
		}
		else {
			totalProfit *= -1;
			System.out.printf("The loss on the stock sales was $%,.2f", totalProfit);
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