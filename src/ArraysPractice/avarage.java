package ArraysPractice;

public class avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		double avarage=0;
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		for(int i=0;i<numbers.length;i++) {
		sum=sum+numbers[i];
		avarage=sum/numbers.length;
		}
		System.out.println(avarage + "Avarage");
	}

}
