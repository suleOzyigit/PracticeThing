package Day_31;

public class MethodWithConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLarger(16, 16);
		
		
	int [] num= {34,20000,45};
	getMax(num);
	steps(-5);
	}
public static void getLarger(int num1,int num2) {
	
	if(num1>num2) {
		
		System.out.println(num1);
	}else if(num2>num1) {
		
		System.out.println(num2);
	}else {
		System.out.println("nums are equal");
	}
}
//create method getMax that accepts int array and find largest numbr in array
public  static void getMax(int[] arr) {
	
	int max=0;
	if(arr.length==0) {
		System.out.println("error: array is empty");
		return;
	}
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
	
}
/*create method steps. it will accepts an int parameter  if the pqrameter is negative then we will print jump that mant times 
 * if parameters =0 sit
 * if parameters is positive step
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public static void  steps(int num) {

	if(num==0) {
		System.out.println("sit");
	}else if(num>0) {
		for(int i =1;i<=num;i++) {
			System.out.println("step" + i);
	}
		
	}else  if(num<0){
		for(int i =1;i<=num*(-1);i++) {
			System.out.println("jump" +i);
		}
	
}
}	
}
















