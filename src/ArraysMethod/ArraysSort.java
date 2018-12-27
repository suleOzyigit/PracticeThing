package ArraysMethod;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,4,3,0,-4,5,3,10};
		Arrays.sort(nums);
		for(int n:nums) {
			System.out.print(n + " ");
			
			
			}
		System.out.println();
		
		char[] value = {'c','C','D', 'A','2'};
		Arrays.sort(value,0,2);
		for(char c:value) {
			System.out.print(c + " ");
		}
	}
}


