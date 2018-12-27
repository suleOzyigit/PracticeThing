package ChicagoPracticeMethod;

import java.util.Arrays;
import java.util.Random;

public class ChicagoPractice {

	public static void main(String[] args) {
		// create method that generates unique random numbers and return in integer array
int []myArr=getUniqueRandom(6,50);
System.out.println(Arrays.toString(myArr));
	}
public static int[] getUniqueRandom(int size,int bound) {
	int [] result=new int[size];
	Random random=new Random();
	boolean check=true;
	int i=0;
	while(check) {
		int num=random.nextInt(bound);
		if(!checkNumber(result,num)) {
	result[i]=num;
	i++;
	}
	if(i==size-1) {
	check=false;	
	}
	
}
return result;
}
public static boolean checkNumber(int[]arr,int target) {
	for(int i:arr) {
		if(i==target) {
			return true;
		}
	}
	return false;
}
}
