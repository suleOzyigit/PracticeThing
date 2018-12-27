package ChicagoPracticeMethod;

public class reverseAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="best day ever";
System.out.println(reverseAgain(word));
	}
public static String reverseAgain(String word) {
	int n=word.length()-1;
	String reverse="";

	while(n>=0) {
		reverse=reverse+word.charAt(n);
				n--;
	}
	return reverse;
}
}
