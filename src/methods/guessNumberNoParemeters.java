package methods;

import java.util.Random;

public class guessNumberNoParemeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGuessNumberComputerOnly();
	}
public static void  playGuessNumberComputerOnly() {
Random random=new Random();
int secretNumber=random.nextInt(21);
int count=0;
do{
	count++;
	System.out.println("Guess the secret Number");
	int guessNumber=random.nextInt(21);
	System.out.println("guessing number= "+ guessNumber+ "Count= " + count);
	if(secretNumber==guessNumber) {
		System.out.println("you won");
		break;
	}else {
		System.out.println("you lost");
	}
}while(true);
}
}