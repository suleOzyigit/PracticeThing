package StringExercises;

import java.util.Scanner;

public class Concatenation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Please enter two word");
String one=scan.nextLine();
String two=scan.nextLine();
int lenth=one.length();//....5
char last=one.charAt(lenth-1);
System.out.println(last);
char  first=two.charAt(0);
if(last==first) {
	System.out.println(one+ two.substring(1));
}else {
	System.out.println(one+ two);
}
scan.close();

	}

}
