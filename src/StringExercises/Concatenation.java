package StringExercises;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the two words");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		int newword1=word1.length();
		
		System.out.println("lenght" +newword1);
		char first =word2.charAt(0);
		System.out.println("first" + first);
		char last=word1.charAt(newword1-1);
		if(last==first) {
		System.out.println(""+ word1+ word2.substring(1));
		}else {
			System.out.println(last+first);
		}
		scan.close();
	}

}
