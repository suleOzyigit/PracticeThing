package Day_33;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*method reverse tahe  a string and retrun reverse of it
  
 */
		System.out.println(reverse("sule"));
		
	boolean result=	isPalindrome("scivic");
	System.out.println(result);
	
	System.out.println(isPolindrome2("civic"));
	}
	public static String reverse(String word) {
		String str="";
		for(int i=word.length()-1;i>=0;i--) {
			str=str+word.charAt(i);
		}
		return str;
	}
/*Method is poliddrome
 * take a String check if it is polidram return true or not
 * 
 *
 * 
 */
	
	public static boolean isPalindrome(String word) {
		String str="";
		for(int i=word.length()-1;i>=0;i--) {
			str=str+ word.charAt(i);
				if(word.equalsIgnoreCase(str)) {
					return true;
				}
			
		}
	return false;
}
	public static boolean isPolindrome2(String word) {
		if(reverse(word).equalsIgnoreCase(word)) {
			return true;
		}
		return false;
	}
	
}
