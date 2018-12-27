package ArraysMethod;

import java.util.Scanner;

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Please enter two number");
double n1=scan.nextDouble();
double n2=scan.nextDouble();
add(n1,n2);
	}
public static void add(double num1,double num2) {
	double result=num1+num2;
	System.out.println(result);
	
}
}
