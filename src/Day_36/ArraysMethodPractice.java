package Day_36;

import java.util.Arrays;

public class ArraysMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr1= {10,20,30,40};
int [] arr2= {5,5,5,5};
int[] arr3=addElements(arr1,arr2);
System.out.println(Arrays.toString(arr3));
	}
public static int[]addElements(int[]arr1,int[]arr2){
	int [] sum=new int [arr1.length];
	if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			sum[i]=arr1[i]+arr2[i];
		}
	}
	return sum;
}
}
