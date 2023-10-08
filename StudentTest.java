package tda;

public class StudentTest {
	// Create a StudentTest class in the same project. In the StudentTest class: a. We create two Student objects, one using the default constructor named student1 and another using the convenience constructor named student2. b. Create a method printStudent. The printStudent method takes a Student object as a 
	//parameter and uses the toString method of the Student Class to print the student's information in a human-readable format. toString should not be called explicitly
	//c. We then csll the printStudent method from the main method to print the information for each student.
	public static void printStudent(Student student) {
		System.out.println(student);
	}
	public static void main(String[] args) {
		// Creating Student objects using both constructors
		Student student1 = new Student();  // Default constructor
		Student student2 = new Student("Alex", "Perez", 12345, 21, 3.7);  // Convenience constructor

		// Printing Student information
		printStudent(student1);
		System.out.println();  // Add a separator between students
		printStudent(student2);
	}
}
