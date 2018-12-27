package Day_32;

public class MethodWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email=firstName("sule")+lastName("uslu")+"gmail.com";
		System.out.println(email);
	int max=getMax(56,56);
	System.out.println(max);
		
	}
public static  String firstName(String name) {
	return name;
}
public static String lastName(String lastName) {
	return lastName;
}
public static int getMax(int n1,int n2) {
	int max=0;
	if(n1>n2) {
		max=n1;
	}else if(n1<n2) {
		max=n2;
	}else {
		return n1;
	}
	return max;
}

}
