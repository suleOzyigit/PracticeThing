package Day_33;

import java.util.Arrays;
import java.util.Random;

public class MethodWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*method getIntArray5
 * param =nothing 
 * return array
 * create an array with 5 ints and assign wirh rendom number 1-100 then returns hat arrays
 */
	
		int [] myArr1=getIntArray();
		System.out.println(Arrays.toString(myArr1));
		int [] myArr2=getIntArray();
		System.out.println(Arrays.toString(myArr2));
		int sum1=0;
		int sum2=0;
		for(int i =0;i<myArr1.length;i++) {
			sum1=sum1+myArr1[i];
			
			
		}
		System.out.println("sum1 is " + sum1);
		for(int i=0;i<myArr2.length;i++) {
			sum2=sum2+myArr2[i];
			
		}
		System.out.println("sum2 is " + sum2);
		
			if(sum1>sum2) {
				System.out.println("myArr1 is biggere"+ sum1);
			}else if(sum2>sum1) {
				System.out.println("myArr2 is biggere"+ sum2);	
			}else {
				System.out.println("they are equal");
			}
		}
	
public static int[] getIntArray() {
	int [] nums=new int[5];
	Random rdm=new Random();
	for(int i=0;i<nums.length;i++) {
		nums[i]=rdm.nextInt(100);
		}
	return nums;
	}


}
