package ManipulationExercises2;

import java.util.Scanner;

public class SameOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word");
	String str1=scan.nextLine();
	int lent=str1.length()-1;
	if(str1.charAt(0)==str1.charAt(lent)) {
		System.out.println("true");
	}
	else {
		System.out.println("False");
		scan.close();
	}
	}

}
