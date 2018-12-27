package PracticeFromRepl;

import java.util.Arrays;


public class Dublicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num= {1,1,1,1,5,1,5,10,0};
String[] str= {"a","k","a","c","a"};
Arrays. sort(num);
System.out.println(Arrays.toString(num));
Arrays. sort(str);
int count=0;
for(int i=0;i<num.length-1;i++) {
	if(num[i]==num[i+1]&&num[i]!=num[i+2]) {
		
		
			System.out.println(num[i]);
			
		}
	}
}
//System.out.println(Arrays.toString(num));
//System.out.println(Arrays.toString(str));

	}


