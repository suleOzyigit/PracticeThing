package StringExercises;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the a word");
		String word=scan.nextLine();
		char begin=word.charAt(0);
		
		if(begin=='x') {
		System.out.println(word.substring(1));
		
		}else{
			System.out.println("go head do what ever you want");
		}
		scan.close();
			}
		}
	 
		
	


