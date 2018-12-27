package Day_43;

public class Dinner {
 static int pizzaSlices=8;
 
 
 
 public  void takeSlice() {
	 
	 System.out.println(pizzaSlices);
	 pizzaSlices--;
 }
 public  void takeSlice(int num) {
	pizzaSlices-=num; 
	
 }
}
