package Day_32;

public class Acumulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=getStars(8);
		System.out.println(result);
	int []num= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};	
		for(int n:num) {
			System.out.println(getStars(n));
		}
		
	}
public static String getStars(int n) {
	String str="";
	for(int i=1;i<n;i++) {
		str+="*";
	}
	return str;
}
}
