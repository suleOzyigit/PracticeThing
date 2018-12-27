package Day_40;

public class EmployeeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.firstName="Mike";
		emp1.lastName="Simith";
		emp1.jobTitle="Teacher";
		emp1.salary=2333.3;
		
		
		
		
		Employee emp2=new Employee();
		emp2.firstName="Kayla";
		emp2.lastName="Sabata";
		emp2.jobTitle="laowyer";
		emp2.salary=8633.5;
		
		emp1.employePrint();
		emp1.email(emp1.firstName,emp1.lastName);
		emp2.employePrint();
		emp2.email(emp1.firstName,emp1.lastName);
	}

}
