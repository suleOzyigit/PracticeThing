package Day_43;

public class AtRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Dinner dad=new Dinner();
	Dinner mam=new Dinner();
	Dinner kids=new Dinner();
		
		
		kids.takeSlice(2);
		mam.takeSlice(2); 
		dad.takeSlice(1);
		
		System.out.println(Dinner.pizzaSlices);
	System.out.println(kids.pizzaSlices);
	
	}

	

}
