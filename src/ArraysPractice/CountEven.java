package ArraysPractice;

import java.util.Arrays;

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String my="";	
String [] word= {"Hello","why","by","apple","note"};
for(int i=0;i<word.length;i++) {
 word[i]=""+word[i].charAt(0)+word[i].charAt(word[i].length()-1);
System.out.println(word[i]);
	}
////System.out.println(Arrays.deepToString(word));
//for(String n:word)	{
//	n=""+n.charAt(0)+n.charAt(n.length()-1);
//	System.out.print(n+" ");
//}	
}
}

