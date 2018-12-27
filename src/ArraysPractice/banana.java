package ArraysPractice;

import java.util.Arrays;

public class banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String[] old_r = new String[] {"one","two","three"};
		
		String[] new_r=new String[old_r.length+1];
		String new_word="four";
		
		for(int i=0;i<old_r.length;i++) {
			new_r[i]=old_r[i];
			System.out.println(new_r[i]);
			
		
			
		}
	
		new_r[old_r.length]=new_word;	
			
		
		System.out.println(Arrays.toString(new_r));
	}

}
