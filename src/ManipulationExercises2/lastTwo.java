package ManipulationExercises2;

import java.util.Scanner;

public class lastTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word");
	String str=scan.nextLine();
	int lent=str.length();
	if(lent>=2) {
		System.out.println(str.substring(0, lent-2)+str.charAt(lent-1)+str.charAt(lent-2));
		//System.out.println(str.charAt(lent-2));
				//+str.charAt(lent-2)+str.charAt(lent-1));
		scan.close();
	}
	}

}
