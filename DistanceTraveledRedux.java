import java.util.*;
public class DistanceTraveledRedux {
	public static void main(String[] args) {
		double speed; //to save speed in MPH
		double hours; //amount of time in which vehicle has been traveling
		double distanceTraveled;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How fast, in MPH, was your vehicle traveling?");
		speed = scan.nextDouble();
		scan.nextLine();
		
		while (speed <= 0 || speed > 250) {
			System.out.println("Please enter a valid speed measured in MPH.");
			speed = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("For how many hours did you travel?");
		hours = scan.nextDouble();
		scan.nextLine();
		
		while (hours < 1) {
			System.out.println("Please enter a valid number of hours traveled.");
			hours = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("Hour\tDistance Traveled");
		System.out.println("---------------------------");
		
		for (int count = 1; count <= hours; count++) {
			distanceTraveled = distance(speed, count);
			System.out.print(count);
			System.out.print("\t");
			System.out.printf("%.0f miles", distanceTraveled);
			System.out.println();
		}
	}
	
	/**
		The distance method calculates the distance a vehicle travels over a period of time.
		@param speed The speed, in MPH, that the vehicle is traveling at.
		@param time The time, in hours, that the vehicle has been traveling for.
		@return distance The number of miles the vehicle has traveled.
	*/
	
	public static double distance(double speed, double time) {
		double distance;
		distance = speed * time;
		return distance;
	}
}