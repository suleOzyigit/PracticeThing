package Day_33;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*method countTimes get two string and return  count the occurance of string at the  second string 
 * 
 * 
 */
int result=	countTimes("javakala","a");
	
	System.out.println(result);
	int result2=	countTimesV2("javakalan","a");	
	System.out.println(result2);
	System.out.println(countTimesV3("javakala","a"));
	}
public static int countTimes(String word1,String word2) {
	int count=0;
//	word1=word1.toLowerCase();
//	word1=word2.toLowerCase();
	for(int i=0;i<word1.length();i++) {
	if(word1.substring(i,i+1).equals(word2)) {
	count++;	
	}
	
	
}
	return count;
}
// this way is not working if the str2  is end of the srt1 be careful if is only works when the str2 is inside of str1
//TO Do; you can use if condition to fiz 
public static int countTimesV2(String str1,String str2) {
	String [] arr=str1.split(str2);
	return arr.length-1;
}
public static int countTimesV3(String str1,String str2) {
	int len1=str1.length();
	str1=str1.replaceAll(str2,"");
	int len2=str1.length();
	return len1-len2;
	}
}

