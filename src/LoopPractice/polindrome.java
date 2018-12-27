package LoopPractice;

import java.util.Scanner;

public class polindrome {

	public static void main(String[] args) {
		// Write a Java program which accepts a number from user and check if the number is palindrome or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		String reverse=" ";
       String number=scan.next();
       for(int i=number.length()-1;i>=0;i--) {
      
    	   reverse=reverse+number.charAt(i);
    	   
    	     
       }
       if (number.equals(reverse)) {
    	   System.out.println("Polidram");
    	  
       }else {
    	   System.out.println("Not polidram");
    	  
       }
       scan.close();
	}
	
	
	

}

