package ChicagoEncapsulation;

import java.util.Random;

public class CustomData {
	
	
	
public static void main(String[] args) {

	
	String word="James Bones";
	
	
//	generatePassword(word);
//	generatePassword( word);
	System.out.println(generateUsername( word));
	System.out.println(generatePassword( word));
	System.out.println(" ======Second way======");
	System.out.println(generateUsername2( word));
	System.out.println(generatePassword2( word));
}
public static String generateUsername(String word) {
	word=word.replace(" ","");
	Random rendom=new Random();
	word=word+rendom.nextInt(100);
	return word.toLowerCase();
	}

public static String generatePassword(String word) {
	word=word.replace(" ","");
	word.toLowerCase();
	Random rendom=new Random();
	String str="";
	for(int i=word.length()-1;i>=0;i--) {
		str=str+ word.charAt(i);
		
	}
	return str+rendom.nextInt(100);
}

public static String generateUsername2(String word) {
	String []arr=word.split(" ");
	String result="";
	Random rendom=new Random();
	if(arr.length>1) {
		for(String s:arr) {
			result=result+s;
		}
		
		result=result+rendom.nextInt(100);
		return result.toLowerCase();
	}else {
		word=word+rendom.nextInt(100);
		return word.toLowerCase();
	}
	
	
	
	
}

public static String generatePassword2(String word) {
	word=word.replace(" ","");
	
	
	StringBuilder sb=new StringBuilder(word);
	sb.reverse();
	Random rendom=new Random();
	sb.append(rendom.nextInt(100));
	return sb.toString().toLowerCase();
}




}

