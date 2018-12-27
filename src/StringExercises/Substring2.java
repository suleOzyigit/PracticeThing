package StringExercises;

import java.util.Scanner;

public class Substring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the a word");
		String word=scan.nextLine();
		char begin=word.charAt(0);
		char second=word.charAt(1);
		
		if(begin=='x'&&second=='x') {
			System.out.println(word.substring(2));
		}else if(begin=='x'){
			System.out.println(word.substring(1));
			
		}else if(second=='x') {
			System.out.println(word.substring(0,1)+ word.substring(2));
					
		}else {
			System.out.println(word);
		}
		scan.close();	
	}

}
