package ArraysPractice;

import java.util.Random;
import java.util.Scanner;

public class Avaragewitharrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int avarage;
int sum=0;
Random random=new Random();
	System.out.println("Please enter haw many items in array");
	int count=scan.nextInt();
	int[]number=new int[count];
	for(int i=0;i<count;i++) {
	
	number[i]=random.nextInt(10);
	
	}
	for(int n:number) {
		
		System.out.print(n + " ");
	sum=sum+n;	
		
	}
	avarage=sum/count;
	System.out.println("your avarage=" + avarage);
	scan.close();
}
	}


