import java.util.*;
import java.io.*;
public class EvenOddCalculator {
	public static void main(String[] args) {
		Random rand = new Random();
		int totalEven = 0;
		int totalOdd = 0;
		for (int count = 1; count <= 100; count ++) {
			int num;
			num = rand.nextInt();
			boolean even;
			even = isEven(num);
			if (even == true) {
				totalEven += 1;
			}
			else {
				totalOdd += 1;
			}
		}
		
		System.out.print("The loop generated " + totalEven + " even numbers ");
		System.out.print("and " + totalOdd + " odd numbers.");
		System.out.println();
	}
	
	/**
		The isEven method determines whether or not a number is even.
		
		@param num An integer
		@return amIEven A boolean value that, if true, indicates num is even
	*/
		
	public static boolean isEven(int num) {
		boolean amIEven;
		if((num % 2) == 0) {
			amIEven = true;
		}
		else {
			amIEven = false;
		}
		
		return amIEven;
	}
}