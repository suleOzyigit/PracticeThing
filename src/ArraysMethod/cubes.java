package ArraysMethod;

import java.util.Scanner;

public class cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

int num=1;
cube(num);
	}
public static void cube(int n) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter a number");
	 n=scan.nextInt();
	 n=n*n*n;
	 System.out.println(n);
	 scan.close();
}
}
