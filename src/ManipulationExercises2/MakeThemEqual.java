package ManipulationExercises2;

import java.util.Scanner;

public class MakeThemEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	int lent1=str1.length();
	int lent2=str2.length();
	//System.out.println(lent1);
	//System.out.println(lent2);
	//int dif1=lent1-lent2;
	if(lent1==lent2) {
		System.out.println(str1+str2);
		
	}else if(lent1>lent2) {
		System.out.println(str1.substring(0,lent2)+str2);
	}else {
		System.out.println(str2.substring(0,lent1)+str1);
	}
	scan.close();
	}
	}


