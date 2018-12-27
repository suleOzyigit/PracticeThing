package PracticeFromRepl;

import java.util.Arrays;

public class DecimalsToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=35;
int []arr=new int[8];
for(int i=arr.length-1;i>=0;i--) {
	
	arr[i]=num%2;
	num=num/2;
	
}
System.out.print(Arrays.toString(arr));
	}

}
