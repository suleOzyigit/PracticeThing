package Day_31;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add(5,6);
//sub(5,6);
//mult(8,9);
//div(18,9);
		double n1=0;
		double n2=0;
//add(n1,n2);
//sub(n1,n2);
//mult(n1,n2);
//div(n1,n2);
Scanner scan=  new Scanner(System.in);
System.out.println("Please enter two number");
 n1=scan.nextDouble();
 n2=scan.nextDouble();
 System.out.println("please select to operation");
 int operation =scan.nextInt();
switch(operation) {
case 1:
	add(n1,n2);
	break;
case 2:
	sub(n1,n2);
    break;
case 3:
	mult(n1,n2);
	break;
case 4:
	div(n1,n2);
	break;
default:
	System.out.println("Error: invalid operation");
	break;	
}


scan.close();
	}
public static void  add(double num1, double num2) {
	
	System.out.println(num1+num2);
}
public static void sub(double num1,double num2) {
	System.out.println(num1-num2);
}
public static void mult(double num1,double num2) {
	System.out.println(num1*num2);
}
public static void div(double num1,double num2) {
	if(num2==2) {
	System.out.println("Error: can not divide by zero");	
	}else {
	System.out.println(num1/num2);	
} 
	
	
}
}
