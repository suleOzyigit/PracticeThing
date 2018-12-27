package ArraysPractice;

public class dublicated {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 5, 5, 6, 6, 7, 2};
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
			if(numbers[i]==numbers[j]) {
				count++;
				System.out.println("dublicated elements" +  numbers[i] );
			}
			
			
		  }
			
		}
		//System.out.println(numbers[i]+ "is duplicated there are "+ count +"so return is "+ count);	
	}

}

