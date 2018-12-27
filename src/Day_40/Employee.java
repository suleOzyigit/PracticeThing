package Day_40;

public class Employee {
String firstName;
String lastName;
String email;
String jobTitle;
double salary;

public void employePrint() {
	System.out.println("employe information ");
	System.out.println("\n");
	System.out.println("first name = " + firstName);
	System.out.println("Last name = " + lastName);
	System.out.println("jaob = " + jobTitle);
}

public void email(String firstName,String lastName) {
	String email=firstName+lastName+"@gmail.com";
	System.out.println(email);
}
}