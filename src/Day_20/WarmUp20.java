package Day_20;

import java.util.Scanner;

public class WarmUp20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("please enter two number");
int num1= scan.nextInt();
int num2= scan.nextInt();
if(num1>num2) {
	while(num2<=num1) {
		System.out.println(num2);
		num2++;
	}
}else if(num2>num1) {
	while(num1<=num2) {
		System.out.println(num2);
		num2--;
	}
}else {
	System.out.println("nums are equal");
}
scan.close();

	}

}
