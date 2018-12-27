package ManipulationExercises2;

import java.util.Scanner;

public class bad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word");
	String str=scan.nextLine();
	
	int lent=str.length();
	if(lent>=4) {
		if(str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad"));
			System.out.println("true");
				
		}else {
			System.out.println("false");
		}
	scan.close();
	}
	}


