package ArraysPractice;

import java.util.Arrays;

public class Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums= {1,2,3,4};
for(int i=0;i<nums.length/2;i++) {
	int temp=0;
	temp=nums[i];
	nums[i]=nums[nums.length-1-i];
	nums[nums.length-1-i]=temp;
	
}
System.out.println(Arrays.toString(nums));

	}

}
