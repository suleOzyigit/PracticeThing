package Day_40;

public class movieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Movie m1=new Movie();
		m1.name="Gladiater";
		m1.length=2;
		
		Movie m2=new Movie();
		m2.name="Star wars";
		m2.length=4;
		System.out.println(m1.name);
		System.out.println(m1.length);
		m1.watch();
		
		System.out.println(m2.name);
		System.out.println(m2.length);
		m2.watch();
		m1.buy(24.99);
	}
	

}
