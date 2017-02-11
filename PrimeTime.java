public class PrimeTime {
	public static void main(String[] args) {
		int remainder = 0;
		int prime = 0, notPrime = 0;
		int count;
		System.out.println("The prime numbers are: ");
		for(int num = 2; num < 100; num++) {
			prime = 0;
			notPrime = 0;
			for(count = 2; count < 10; count++) {
				remainder = num % count;
				if (num != count && remainder == 0) {
					notPrime += 1;
				}
				else {
					prime += 1;
				}
			}
			
			if (notPrime == 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
	}
}