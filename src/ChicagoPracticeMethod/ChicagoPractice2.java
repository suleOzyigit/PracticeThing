package ChicagoPracticeMethod;

import java.util.Arrays;

public class ChicagoPractice2 {

	public static void main(String[] args) {
		/*cretae  a method that accepts String array 
		 * method should find an element that consist of first name and last name of sti=udents and return the new array
		 * 
		 * 
		 * 
		 * 
		 */
		// 1.count the elements that has two or two words
		//2. create array with the count size
		//3. iterate through eachelement again and set elements that has two word
String [] names= {"Smith Maze", "Jon","Lazy Person","Crazy Dude", "Lizz"};
String [] myArr=StudentsList(names);
System.out.println(Arrays.toString(myArr));
	}
public static String []StudentsList(String [] names){
	//String[] myArr=new String[Name.length];
	int count=0;
	for(String name:names) {
		name=name.trim();
		int numOfWord=name.split(" ").length;
		if(numOfWord>1) {
		count++;
	}
	}
	String[] result=new String[count];
	int index=0;
	for(String name:names) {
		name=name.trim();
		int numOfWord=name.split(" ").length;
		if(numOfWord>1) {
			result[index]=name;
			index++;
		}
	}
	
	return result;
}
}
