package PracticeFromRepl;

import java.util.Arrays;

public class Stringreverse {

	public static void main(String[] args) {
		// Giving a String Value reverse it
//String str="Java is fun";
//String [] reverse=str.split(" ");
//
//for(int i=reverse.length-1;i>=0;i--) {
//	
//	System.out.print(reverse[i]+" ");
//}
	System.out.println("====new question===");	
String [] str1= {"Hello" ,"Why","by","apple"};
String R="";for(int i=0;i<str1.length;i++) {
	R= str1[i].substring(0, 2);
	System.out.println(R);
}
boolean falag=false;
System.out.println("====new question===");
int [] nums= {1,5,6,5,1,8,10,6};
for(int i=0;i<nums.length-1;i++) {
	if(nums[i]==5&&nums[i+1]==5) {
	falag=true;
	break;
}
}
System.out.println(falag);
System.out.println("====new question===");
int count=0;
for(int i=0;i<nums.length;i++) {
	if(nums[i]%2==0) {
		count++;
	}
}
System.out.println(count);
System.out.println("====new question===");
int [] num= {1,5,6,5,1,8,10,6};

int temp=0;
for(int i=0;i<num.length/2;i++) {
	
	temp=num[i];
	num[i]=num[num.length-1-i];
	num[num.length-1-i]=temp;
	
}
System.out.print(Arrays.toString(num));
}
}
