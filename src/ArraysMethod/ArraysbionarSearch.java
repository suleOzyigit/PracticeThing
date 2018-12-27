package ArraysMethod;

import java.util.Arrays;

public class ArraysbionarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cake","tomato", "wooden spoon" , "pizza"};
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.binarySearch(words,"pizza"));
		System.out.println();
		
		int[] a = {10,20,30};
		int[] b=Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(b));
		b[3]=111;
		System.out.println(Arrays.toString(b));
}
}
