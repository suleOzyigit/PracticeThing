package ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []r1= {"f","o","o"};
String []r2= {"b","a","a"};
ArrayList<String> myList = new ArrayList<String>();
myList.addAll(Arrays.asList(r1)); 
myList.addAll(Arrays.asList(r2));
String result=String.join("", myList);
System.out.println(result);
String word=result.substring(0, r1.length) + " " + result.substring(r1.length);
  System.out.println(word);
	}



}

