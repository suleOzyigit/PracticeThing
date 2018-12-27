package Day_20;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter the word");
String str=scan.nextLine();
String word="";
int n=0;
while(n<str.length()) {
	
	
	word=""+str.charAt(n);
System.out.println(word);
n++;	
}

scan.close();
	}

}
