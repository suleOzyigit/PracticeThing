package ChicagoPracticeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
List <Integer> nums=new ArrayList<>();
for(int i=0;i<5;i++) {
	System.out.println("Please enter 5 number");
	int n=scan.nextInt();
	if(n%2==0) {
		nums.add(n);
	}
}
System.out.println(nums);
scan.close();
String s="James";
String s3="James";
String k=s;

System.out.println(s.hashCode());
System.out.println(s3.hashCode());
System.out.println(k.hashCode());
	}

}
