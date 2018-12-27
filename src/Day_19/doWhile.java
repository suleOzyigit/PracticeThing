package Day_19;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
//		int num=1;
//		do {
//			System.out.println(num);
//			num++;
//		}while(num<6);
		Scanner scan=new Scanner(System.in);
		int amount;
		do{
			System.out.println("Give me 5 dolar");
		amount=scan.nextInt();	
		
		}while(amount!=5);
		System.out.println("thanks");
		scan.close();
	}

}
