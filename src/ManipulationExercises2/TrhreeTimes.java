package ManipulationExercises2;

import java.util.Scanner;

public class TrhreeTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
	String str=scan.nextLine();
	int lent=str.length();
	if(lent>=2) { 
		System.out.println(str.substring(0,2)+str.substring(0,2)+str.substring(0,2));
	}
	//System.out.println();
	scan.close();
	}

}
