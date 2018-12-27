package StringExercises;

import java.util.Scanner;

public class concanation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter two word");
		String one=scan.nextLine();
		String two=scan.nextLine();
		
		int lent=one.length()-1;
		
		char last=one.charAt(lent);
		char first=two.charAt(0);
		
	if(last==first) {
		System.out.println(one+ two.substring(1));
	}	
	scan.close();	
	}

	
	}


