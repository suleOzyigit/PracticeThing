package Day_32;

import java.util.*;

public class GuessTheNumber {
	//playGuessNumComputerOnly()
	//playGuessNumWithLimit(int limit)
	//playGuessNumComputerVSMe(int secretNum)
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//playGuessNumComputerOnly();
		playGuessNumWithLimit(3);
}
	
	
	
	public static void playGuessNumComputerOnly() {
		Random random=new Random();
		int secretNumber= random.nextInt(21);
		int count=0;
		do {
			count++;
			System.out.println("Guess the secret Number");
			int guessNumber= random.nextInt(21);
			System.out.println("Guess=" + guessNumber + "Counter =" + count);
			if(guessNumber==secretNumber) {
				System.out.println("you won");
				break;
			}else {
				System.out.println("wrong try again" );
			}
		}while(true);
	}
	
public static void playGuessNumWithLimit(int limit) {
	Random random=new Random();
	int secretNumber= random.nextInt(21);
	int count=0;
	do {
		count++;
		System.out.println("Guess the secret Number");
		int guessNumber= random.nextInt(21);
		System.out.println("Guess=" + guessNumber + "Counter =" + count);
		if(guessNumber==secretNumber) {
			System.out.println("you won");
			break;
		}else {
			System.out.println("wrong try again" );
		}
		if(count==limit) {
			System.out.println("you lost Game over");
		}
	}while(true);	
	}
//public static void playGuessNumComputerVSMe(int secretNum) {
//	
//}
}