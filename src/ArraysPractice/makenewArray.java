package ArraysPractice;

public class makenewArray {

	public static void main(String[] args) {
		// Write a Java program to copy an array by iterating the array.
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int newlist[]= new int[my_array.length];
		for(int i=0;i<my_array.length;i++) {
			newlist[i]=my_array[i];
			System.out.print(newlist[i]);
		}
	}

}
