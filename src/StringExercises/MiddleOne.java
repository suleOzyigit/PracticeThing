package StringExercises;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the a word");
		String word1=scan.nextLine();
		int lent=word1.length();
		if(lent/2!=0&&lent>=3) {
		int middle=lent/2;
		System.out.println(word1.charAt(middle));
		}else {
			System.out.println("invalid");
		}
		scan.close();
	}

}
