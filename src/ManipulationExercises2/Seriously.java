package ManipulationExercises2;

import java.util.Scanner;

public class Seriously {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word");
	String str1=scan.nextLine();
	int lent1=str1.length();
	
	if(str1.substring(lent1-2).equals("ly")) {
		System.out.println("really");
	}else {
		System.out.println("Never Mind");
		scan.close();
	}
	}

}
