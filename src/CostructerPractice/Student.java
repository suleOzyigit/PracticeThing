package CostructerPractice;


/*Write a program to print the names of students by creating a Student class. 
 * If no name is passed while creating an object of Student class, then the name should be "Unknown", 
 * otherwise the name should be equal to the String value passed while creating object of Student class.
 * 
 * 
 */
public class Student {
	String name;
	public Student(String name) {
		this.name=name + " a constructer name";
	}
	public Student() {
		name="unknown";
	}
}
