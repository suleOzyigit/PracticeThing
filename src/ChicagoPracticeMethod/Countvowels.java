package ChicagoPracticeMethod;

public class Countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a method that accepts a string and
 *  prints out the number of vowels and consonants within that string.
 * 
 * 
 */
	String word="apple";
	countVowelandConstant(word);
	}
public static void countVowelandConstant(String word) {
	int countVowel=0;
	int constanst=0;
	
	for(int i=0;i<word.length();i++) {
	if((word.substring(i,i+1).equals("a"))||(word.substring(i,i+1).equals("e"))||word.substring(i,i+1).equals("i")||word.substring(i,i+1).equals("u")||word.substring(i,i+1).equals("o"))	{
		countVowel++;

		
	}else {
		constanst++;
		
		
	}
	}
	System.out.println("the word has= " +countVowel+"wovel"+" " +"the word has= " +constanst+"constanst");
}
}
