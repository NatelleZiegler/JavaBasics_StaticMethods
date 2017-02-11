import java.util.*;
public class PrimeMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number greater than or equal to 2.");
		int userNum;
		userNum = scan.nextInt();
		scan.nextLine();
		
		while (userNum < 2) {
			System.out.println("Please enter a number greater than or equal to 2.");
			userNum = scan.nextInt();
			scan.nextLine();	
		}
		
		boolean isMyNumPrime = isPrime(userNum);
		System.out.println("It is " + isMyNumPrime + " that " + userNum + " is prime.");
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