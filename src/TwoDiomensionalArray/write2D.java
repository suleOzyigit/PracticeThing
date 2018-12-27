package TwoDiomensionalArray;

import java.util.Arrays;

public class write2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] myArray= {{1,2,3},
                   {2,3,4,5}};
                   
int [][] nums=new int[2][4];
nums[0][0]=2;
nums[0][1]=3;	
nums[0][2]=5;
nums[0][3]=3;	

nums[1][0]=1;
nums[1][1]=1;
nums[1][2]=1;
nums[1][3]=2;


System.out.println(nums[0][0]);
System.out.println(nums.length);
System.out.println(nums[1].length);
System.out.println(Arrays.deepToString(nums));
	}

}
