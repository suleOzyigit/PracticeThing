package Day_20;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
Random random=new Random();
int guessNumber;
int secretNumber=random.nextInt(10);
//System.out.println(random.nextInt(50));
do{
	System.out.println("Please guess a number");
	guessNumber=scan.nextInt();
	if(guessNumber==secretNumber) {
		System.out.println("you won");
	}else {
		System.out.println("try again");
	}
}while(guessNumber!=secretNumber); 
	
scan.close();
	}

}
