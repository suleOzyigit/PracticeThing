package ChicagoPracticeMethod;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Display Fibonacci series using while loop
//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + ....
	
		fibonacci(10);
		fibonacci2(10);
	
	}
public static void fibonacci(int n) {
	int i=0;
int n1=0;
int n2=1;
while(i<=n) {
	
	System.out.print(n1+ " ");
	int sum=n1+n2;
	n1=n2;
	n2=sum;
	i++;
}
System.out.print("\n ");
}


public static void fibonacci2(int n) {
	int n1=0;
	int n2=1;
	int sum=0;
	for(int i=0;i<=n;i++) {
		System.out.print(n1+ " ");
			
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}
	
}
}
