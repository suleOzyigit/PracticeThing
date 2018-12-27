package ChicagoPracticeMethod;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*create a method that accepts String if String contains word con if yes remove word con from giving string and return s modifies string
 * 
 * 
 * 
 */
		
		System.out.println(con("consequences"));
		System.out.println(con("concon"));
		System.out.println(con("consequences","con"));
	}
	public static String con(String word) {
		word=word.toLowerCase().trim();
		
		if(word.contains(" ")) {
			System.out.println("invalid data");
			return "";
		}else if(word.length()<3) {
			System.out.println("invalid data");
			return "";
		}
	else if(word.contains("con")) {
		StringBuilder sb=new StringBuilder(word);
sb.delete(word.indexOf("con"),word.indexOf("con")+3);
return sb.toString();
	}
	else {
		return word;
	}
}
	public static String con(String word,String target) {
word=word.toLowerCase().trim();
target=target.toLowerCase().trim();		
		if(word.contains(" ")) {
			System.out.println("invalid data");
			return "";
		}else if(word.length()<target.length()) {
			System.out.println("invalid data");
			return "";
		}
	else if(word.contains(target)) {
		StringBuilder sb=new StringBuilder(word);
sb.delete(word.indexOf(target),word.indexOf(target)+target.length());
return sb.toString();
	}
	else {
		return word;
	}	
	}
}
