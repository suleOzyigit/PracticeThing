package Practice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// switch case helps us to check more then one if at the same time
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your ages" );
int age=scan.nextInt();
switch(age) {
case 16:
case 17:

	
	System.out.println("You can not apply the course");
	break;
case 18:
	System.out.println("you can apply the course");
}
scan.close();
	}

}
//write a program called CheckClass
//we have a day with number in it
//and we are going to checkwhat day it is
//day 1  ClassAtSchool"Group project"
//String WeekdayName="Monday"
//day 2 


