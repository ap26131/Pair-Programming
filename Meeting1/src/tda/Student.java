package tda;

public class Student {
	// data members
	private String firstName, lastName;
	private int id, age;
	private double gpa;
	
	public Student() {
		this("","",0,0,0.0);
	}
	
	public Student(String firstName, String lastName, int id, int age, double gpa) {
		setFirstName(firstName);
		setLastName(lastName);
		setId(id);
		setAge(age);
		setGpa(gpa);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	//Override
	public String toString() {
		return String.format("Student Name: %s %s's, ID; %d, Age: %d years old and GPA is %f", getFirstName(),getLastName(),getId(),getAge(),getGpa());
	}
}

