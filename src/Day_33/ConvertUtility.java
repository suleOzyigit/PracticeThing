package Day_33;

public class ConvertUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double result=miles2Km(20);
System.out.println(result);
if(miles2Km(50)<100.0) {
	System.out.println("Speed is good");
}else {
	System.out.println("slow down");
}


System.out.println(fahrenheitToCelcius(68));
	}
	public static double  miles2Km(double miles) {
		double km=miles*1.609344;
		return km;
	}
	public static double fahrenheitToCelcius(double fahrenheit) {
		double celcius=(fahrenheit-32)*1.8;
		return celcius;
	}
}
