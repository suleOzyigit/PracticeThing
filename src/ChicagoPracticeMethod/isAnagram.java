package ChicagoPracticeMethod;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* find if is string anagram
 * 
 * 
 */
		System.out.println(isAnagram("march","charm"));
	}
		public static boolean isAnagram(String str1, String str2) {
			if(str1.length()!=str2.length()) {
				return false;
			}
			char[]arr1=str1.toCharArray();
			char[]arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<str1.length();i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
		
		return true;
	}

}
