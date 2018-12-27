package methods;

import java.util.Random;

public class GuessNumberwithParameters {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		playGuessNumWithLimit(2);
	}
public static void playGuessNumWithLimit(int limit) {
	
	Random random=new Random();
	int secretNum=random.nextInt(21);
	int count=0;
	do {
		count++;
		System.out.println("Guess the secret number ");
		int guessNum=random.nextInt(21);
		System.out.println("Guessing :" + guessNum + " Counter:"+ count);
		if(secretNum==guessNum) {
			System.out.println("You won ");
			break;
		}else {
			System.out.println("wring try agaig");
		}
		if(count==limit) {
			System.out.println("Game is over");
		}
	}while(true);
}
}	

