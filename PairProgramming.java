package tda;

public class PairProgramming {
	public static void main(String[] args) {
//		// Task 1: print "This is TDA's first Pair Programming Activity"
//		System.out.println("This is TDA's First Pair Programming Activity!");
		
//		// Task 2: Extend the existing code by adding a for loop to print numbers from 1 to 10 on separate lines
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// Task 3: Modify the code to calculate and print the product of all numbers from 1 to 10 using a loop
		int total = 1;
		
		for (int i = 1; i <= 10; i++) {
			total *= i;
		}
		
		System.out.printf("The product of all numbers from 1 to 10 is %d",total);
	}
}
