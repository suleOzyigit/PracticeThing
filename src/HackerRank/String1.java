package HackerRank;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// Sum of the lengh A and B
		//
Scanner scan=new Scanner(System.in);
System.out.println("Please enter two word");
String A=scan.next();
String B=scan.next();
System.out.println(A.length()+B.length());

if(A.compareTo(B)<0) {
	System.out.println("No");
}else if(A.equals(B)) {
		System.out.println("Wrong Answer");
	}else {
	System.out.println("No");
}
System.out.println((A.substring(0,1).toUpperCase())+A.substring(1).toLowerCase() + " " +B.substring(0, 1).toUpperCase()+ B.substring(1).toLowerCase());
scan.close();
	}

} 
