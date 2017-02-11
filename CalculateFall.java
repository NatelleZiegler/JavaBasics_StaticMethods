public class CalculateFall {
	public static void main(String[] args) {
		double meters; //the distance our object has fallen
		for (int sec = 1; sec <= 10; sec++) {
			meters = fallingDistance(sec);
			System.out.println("Time\t\tDistance");
			System.out.printf("%d second(s)\t%.2f meters", sec, meters);
			System.out.println();
		}
	}
	
	/**
		The fallingDistance method calculates the distance an object has fallen in meters because of gravity
		
		@param time The amount of time, in seconds, an object has been falling
		@return distance The amount of space, measured in meters, an object has fallen
	*/
	
	public static double fallingDistance(double time) {
		double distance;
		final double CONSTANT = 0.5;
		final double GRAVITY = 9.8;
		distance = CONSTANT * GRAVITY * time * time;
		return distance;
	}
}