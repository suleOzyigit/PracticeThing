package ManipulationExercises2;

import java.util.Scanner;

public class MakeASandavich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
	String str1=scan.nextLine();	
	String str2=scan.nextLine();
	int lent1=str1.length();
	if(lent1%2==0);
	System.out.println(str1.substring(0,lent1/2)+ str2+ str1.substring(lent1/2));
	scan.close();
	}

}
