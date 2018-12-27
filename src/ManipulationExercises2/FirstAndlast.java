package ManipulationExercises2;

import java.util.Scanner;

public class FirstAndlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("please enter two word");
String str1=scan.nextLine();
String str2=scan.nextLine();


System.out.println(""+str1.charAt(0) + str2.charAt(str2.length()-1));
//System.out.println(str2.charAt(str2.length()));
scan.close();
	}

}
