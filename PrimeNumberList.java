import java.io.*;
public class PrimeNumberList {
	public static void main(String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("PrimeFile.txt");
		outputFile.println("Here are the prime numbers under 100: ");
		for (int count = 2; count <= 100; count ++) {
			boolean isItPrime = isPrime(count);
			if (isItPrime == true) {
				outputFile.print(count + " ");
			}
		}
		outputFile.println();
		outputFile.close();
	}
		
	/**
		The isPrime method tests weather or not a number is prime.
		
		@param num A user entered number.
		@return isPrime A boolean value that indicates weather or not the number is prime.
	*/
	
	public static boolean isPrime (int num) {
		int prime = 0;
		int notPrime = 0;
		int remainder;
		boolean isPrime;
		
		for (int count = 2; count < 10; count++) {
			remainder = num % count;
			if (num != count && remainder == 0) {
				notPrime += 1;
			}
			else {
				prime += 1;
			}
		}
		if (notPrime == 0) {
			isPrime = true;
		}
		else {
			isPrime = false;
		}
		return isPrime;
	}
}