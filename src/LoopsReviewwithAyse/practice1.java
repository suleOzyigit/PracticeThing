package LoopsReviewwithAyse;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag=true;
Scanner scan=new Scanner(System.in);
scan.close();
while(flag) {
	System.out.println("please write  something");
String str=scan.next();	
System.out.println();
System.out.println("you wrote" +str);
if(str=="exit") {
	flag=false;
}
}
System.out.println("Good by");	}

}
