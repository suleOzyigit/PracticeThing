package ArraysPractice;

import java.util.Scanner;

public class Avarage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter how many items in arrays");
int count=scan.nextInt();
int[]number=new int[count];
int sum=0;

System.out.println("enter nUmbers");
for(int i=0;i<count;i++) {
	number[i]=scan.nextInt();
	sum=sum+number[i];
}
int avarage=sum/count;
int countabove=0;
for(int i=0;i<count;i++) {
	if(number[i]>avarage) {
		countabove++;
	}
	System.out.println("avarage of number = "+ avarage);
	System.out.println("count of number above avarage"  + count);
	break;
}
scan.close();
	}

}
