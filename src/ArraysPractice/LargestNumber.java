package ArraysPractice;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {10,20,30,40,50,60,1,3,5,6};
		int max=0;
		for(int i:number) {
			if(i>max) {
				max=i;
			}
			
		}
		System.out.println(max + "= max number");
	}

}
