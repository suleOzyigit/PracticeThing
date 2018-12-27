package StringExercises;

import java.util.Scanner;

public class Middle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the a word");
		String word=scan.nextLine();
		int lent=word.length();
		int midlle= lent/2;
		if(lent%2!=0&&lent>=5) {
			System.out.println(" "+ word.charAt(midlle-1)+word.charAt(midlle)+ word.charAt(midlle+1));
			
			
			
		}else {
			System.out.println("invalid");
		}
		scan.close();
	
	}
}
