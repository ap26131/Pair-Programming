package tda;

public class PairProgramming {
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
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.printf("The product of all even numbers from 1 to 100 is %d",sum);
		
	}
}
