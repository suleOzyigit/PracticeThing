package ChicagoPracticeMethod;

public class wethodReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word= "today is a great day";
sentence( word);
String str="kayaksule";
System.out.println(isPalindrome(str));
String contain= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";

System.out.println(resultTime("About 691,000,000 result (0,078"));
System.out.println(doesContain(contain));
	}
public static void  sentence(String word) {
	int count=0;
	String[] str=word.split(" ");
	for(String s:str) {
		count++;
		
	}
	System.out.println("number of sentence in this word is=" + count);
}
public static boolean isPalindrome(String str) {
	String reverse="";
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		
	}
	//.out.println(reverse);
	if(reverse.equalsIgnoreCase(str)) {
		return true;
	}
	return false;
}
public static String resultTime(String result) {
	String [] word=result.split(" ");
	return word[1].replaceAll(",","");
	
}
public static boolean doesContain(String check) {
	String[] str=check.split("\\.");
	String third=str[2];
	if(third.contains("massa")) {
		return true;
	}
	return false;
}

}



















