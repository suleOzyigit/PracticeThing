package ArraysClassNotes;

public class Day25_class {

	public static void main(String[] args) {
		// // create int array points and issing 10 differnt scores
		//between 0 and 100
		//using a for loop print each item in reverse order in sam eline
		//using while loop 
		// check the length
		int[] nums= {10,20,30,40,60,70,80,90,100};
		for(int i=nums.length-1;i>=0;i--) {
			System.out.print(nums[i]+ " ");
			
		}
		System.out.println();
		System.out.println("\nwith whileee");
		int k=nums.length-1;
		while(k>=0) {
			System.out.print(nums[k]+" ");
			k--;
		}
		System.out.println();
		System.out.println("\n now reverse while ");
		int n=0;
		while(n<nums.length) {
			System.out.print(nums[n] + " ");
			n++;
		}
		System.out.println();
		if(nums.length==10) {
			System.out.println("array has 10 item");
		}else {
			System.out.println("need more item");
		}
	}

}
