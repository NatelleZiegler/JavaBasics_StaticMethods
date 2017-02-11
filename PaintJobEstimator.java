import java.util.*;
public class PaintJobEstimator {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int numRooms;
		double paintPrice; //price of paint per gallon
		double roomWallSpace; //wall space for one room
		System.out.print("How many rooms are you painting? ");
		numRooms = scan.nextInt();
		scan.nextLine();
		
		while (numRooms <= 0) {
			System.out.println("You must have at least one room you would like to paint.");
			System.out.print("How many rooms are you painting? ");
			numRooms = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.print("How much does the paint you are using cost per gallon? ");
		paintPrice = scan.nextDouble();
		scan.nextLine();
		
		while (paintPrice <= 0) {
			System.out.println("The price of your paint per gallon must be greater than zero.");
			System.out.print("How much does the paint that you are using cost per gallon? ");
			paintPrice = scan.nextDouble();
			scan.nextLine();
		}
		
		double wallSpace = 0; //the total amount of wall space you need painted in this job
		for (int count = 1; count <= numRooms; count ++) {
			System.out.print("How much wall space, measured in square feet, do you need painted in room number " + count + "? ");
			roomWallSpace = scan.nextDouble();
			scan.nextLine();
			
			while (roomWallSpace <= 0) {
				System.out.println("The amount of square feet in your room must be greater than zero.");
				System.out.print("How much wall space, measured in square feet, do you need painted in room number" + count + "? ");
				roomWallSpace = scan.nextDouble();
				scan.nextLine();
			}
			
			wallSpace += roomWallSpace; //adding the amount of wall space per room to the grand total wall space
		}
		
		double paintGallons; //The total number of paint gallons needed to complete job
		paintGallons = getGallons(wallSpace);
		double totalHours; //The total number of hours the job will take to complete
		totalHours = getHours(wallSpace);
		double totalPaintCost; //The total cost of paint needed to complete the job
		totalPaintCost = getPaintCost(paintPrice, paintGallons);
		double totalLaborCost; //The total cost of labor to complete the job
		totalLaborCost = getLaborCosts(totalHours);
		double totalCost; //Total cost of the job is labor costs plus paint costs
		totalCost = getTotalCost(totalPaintCost, totalLaborCost);
		
		System.out.println();
		System.out.println("Breakdown of charges: ");
		System.out.println();
		System.out.printf("Paint\t\t$%,.2f\n", totalPaintCost);
		System.out.printf("Labor\t\t$%,.2f\n", totalLaborCost);
		System.out.println("----------------------------");
		System.out.printf("Total cost\t$%,.2f\n", totalCost);
		
	}
		
		/**
			The getGallons method will determine the amount of gallons needed to finish this job.
			
			@param wallFeet The total square feet of wall space that needs painted.
			@return gallons The total gallons of paint required for job.
			
		*/
		
		public static double getGallons(double wallFeet) {
			double gallons;
			gallons = wallFeet / 115;
			return gallons;
		}
		
		/**
			The getHours method will calculate the number of hours needed to finish this job.
			
			@param wallFeet The total square feet of wall space the client wants painted
			@return hours The total number of hours the job will take
			
		*/
		
		public static double getHours(double wallFeet) {
			double hours; //hours of labor required
			hours = wallFeet / 115;
			hours *= 8;
			return hours;
		}
		
		/**
			The getPaintCost method will calculate the total cost of paint needed to complete
			this job.
			
			@param costOfPaint The cost of paint being used per gallon
			@param totalGallons The amount of paint needed to complete job
			@return totalPaintCost The total cost of paint in dollars
		*/
		
		public static double getPaintCost(double costOfPaint, double totalGallons) {
			double totalPaintCost;
			totalPaintCost = costOfPaint * totalGallons;
			return totalPaintCost;
			
		}
		
		/**
			The laborCosts method will calculate the total cost of paint needed to complete this job.
			
			@param hours The total hours of labor needed to complete this job
			@return hourPay The total cost of labor
		*/
		
		public static double getLaborCosts(double hours) {
			final double HOURLY_RATE = 18; //Cost for one hour of labor
			double hourPay; //Total cost of labor to complete the job
			hourPay = hours * 18;
			return hourPay;
		}
		
		/**
			The getTotalCost method will calculate the total cost of the job.
			
			@param costOfPaint The total cost of paint
			@param costOfLabor The total cost of labor
			@return grandTotal The total cost of job
		*/
		
		public static double getTotalCost(double costOfPaint, double costOfLabor) {
			double grandTotal; //Total cost of job
			grandTotal = costOfPaint + costOfLabor;
			return grandTotal;
		}
}