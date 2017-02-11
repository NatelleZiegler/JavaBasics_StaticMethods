import java.util.*;
public class Kinetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mass, velocity;
		System.out.print("Please enter the mass, measured in kilograms, of your object: ");
		mass = scan.nextDouble();
		scan.nextLine();
		while (mass < 0) {
			System.out.println("The mass of your object must be a positive number.");
			System.out.print("Please enter the mass, measured in kilograms, of your object: ");
			mass = scan.nextDouble();
			scan.nextLine();
		}
		System.out.print("Please enter the velocity, measured in meters per second, of your object: ");
		velocity = scan.nextDouble();
		scan.nextLine();
		while(velocity < 0) {
			System.out.println("The velocity of your object must be a positive number.");
			System.out.print("Please enter the velocity, measured in meters per second, of your object: ");
			velocity = scan.nextDouble();
			scan.nextLine();
		}
		double kEnergy;
		kEnergy = kineticEnergy(mass, velocity);
		System.out.printf("The kinetic energy of your object is %,.1f", kEnergy);
		System.out.println();
	}
	
	/**
		The kineticEnergy method calculates the kinetic energy of an object that is in motion.
		
		@param mass The mass of a moving object
		@param velocity The velocity of a moving object
		@return KE The kinetic energy of a moving object
	*/
	
	public static double kineticEnergy(double mass, double velocity) {
		double KE;
		final double CONSTANT = 0.5;
		KE = 0.5 * mass * velocity * velocity;
		return KE;
	} 
}
		