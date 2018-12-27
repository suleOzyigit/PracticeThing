package methods;

public class AcumulatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getStars( 5));
int[] myArr= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
for(int S:myArr) {
	System.out.println(getStars( S));
}
	}
public static String getStars(int n) {
	String star="";
	for(int i=0;i<n;i++) {
		star=star+"*";
	}
	return star;
}
}
