package Day_32;

public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=getMax(123,34,412);
System.out.println(result);
boolean valid=isValidDay("monday");
System.out.println(valid);
	}
public static int getMax(int num1,int num2,int num3) {
	int max=0;
	if(num1>num2&&num1>num3) {
		max=num1;
		
	}else if(num2>num1&&num2>num3) {
		max=num2;
	}else {
		max=num3;
	}
	return max;
}
public static  boolean isValidDay(String day) {
	day=day.toLowerCase().trim();
	if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
			   day.equals("thursday") || day.equals("friday") || day.equals("saturday") ||
			   day.equals("sunday")) {
				return true;
			}
			
			return false;
}
}
