public class CelsiusTable {
	public static void main(String[] args) {
		double cTemp ; //degrees celsius
		
		for (int fTemp = 0; fTemp <= 20; fTemp++) {
			cTemp = celsius(fTemp);
			System.out.println("Celsius\t\tFahrenheit");
			System.out.printf("%.2f\t\t%d\n", cTemp, fTemp);
		}
	}
	
	/**
		The celsius method converts Fahrenheit measures to celsius.
		
		@parem fahrenheit A measurement in degrees Fahrenheit
		@return celsiusTemp The Fahrenheit measure converted to celsius
	*/
	
	public static double celsius (int fahrenheit) {
		double celsiusTemp;
		final double CONSTANT = 0.555;
		final double THIRTY_TWO = 32;
		
		celsiusTemp = CONSTANT * ((double)fahrenheit - THIRTY_TWO);
		return celsiusTemp;
	}
}