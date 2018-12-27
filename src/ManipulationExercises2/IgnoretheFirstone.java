package ManipulationExercises2;

import java.util.Scanner;

public class IgnoretheFirstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
	String str1=scan.nextLine();	
	String str2=scan.nextLine();
	
	System.out.println(str1.substring(1)+str2.substring(1));
	scan.close();
	}

}
