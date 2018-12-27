package ManipulationExercises2;

import java.util.Scanner;

public class SameOrNot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	int lent2=str2.length();
	if(str1.substring(0,2).equals(str2.substring(lent2-2))) {
		System.out.println("thrue");
		//abba
		//String w1FirstTwo =word1.substring(0,2);
		//String w2LastTwo=word2.substring(lent-2);
		//if(w1FirstTwo.equals(w2LastTwo)) {
	}else {
	System.out.println("false");
	//System.out.println(str1.substring(0,2));
	}
	scan.close();
	}

}
