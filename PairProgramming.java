package tda;

public class PairProgramming {
	// Method to find and return the largest prime number less than 1000
	public static int findLargestPrimeNum() {
		int largestPrime = 0;
		
		for (int num = 999; num >= 2; num--) {
			boolean isPrime = true;
			
			// Check if the number is prime
			for (int divisor = 2; divisor < num; divisor++) {
				if (num % divisor == 0) {
					isPrime = false;
				}
			}
			
			// If it's prime and greater than the current largestPrime, update it
			if (isPrime && num > largestPrime) {
				largestPrime = num;
			}
		}
		return largestPrime;
	}
	
	public static void main(String[] args) {
		//		// Task 1: print "This is TDA's first Pair Programming Activity"
		//		System.out.println("This is TDA's First Pair Programming Activity!");

		//		// Task 2: Extend the existing code by adding a for loop to print numbers from 1 to 10 on separate lines
		//		for (int i = 1; i <= 10; i++) {
		//			System.out.println(i);
		//		}

		//		// Task 3: Modify the code to calculate and print the product of all numbers from 1 to 10 using a loop
		//		int total = 1;
		//		
		//		for (int i = 1; i <= 10; i++) {
		//			total *= i;
		//		}
		//		
		//		System.out.printf("The product of all numbers from 1 to 10 is %d",total);

		// Task 4: Modify the code to calculate and print the product of all odd numbers from 1 to 10 using a loop. Use an if statement to check if a number is odd before including it in the product calculation
		//		int total = 1;
		//		
		//		for (int i = 1; i <= 10; i++) {
		//			if (i % 2 != 0) {
		//				total *= i;
		//			}
		//		}
		//		
		//		System.out.printf("The product of all odd numbers from 1 to 10 is %d",total);

		// Task 5: Extend the existing code to calculate and print the sum of all even numbers from 1 to 100 using a loop. Utilize an if statement to identify even numbers
		//		int sum = 0;
		//		
		//		for (int i = 1; i <= 100; i++) {
		//			if (i % 2 == 0) {
		//				sum += i;
		//			}
		//		}
		//		
		//		System.out.printf("The product of all even numbers from 1 to 100 is %d",sum);

		// Task 6: Implement a method in the PairProgramming class called findLargestPrimeNum to find and display the largest prime number less than 1000. Use a Loop to search for prime numbers and store the largest found
		int largestPrime = findLargestPrimeNum();
        System.out.printf("The largest prime number less than 1000 is: %d", largestPrime);
	}
}
