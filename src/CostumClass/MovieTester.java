package CostumClass;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie m1=new Movie();
m1.name="Star Wors";
m1.length=180;

Movie m2=new Movie();
m2.name=" Gladiator";
m2.length=180;

m1.watch();
m2.watch();
m1.buy(10.0);
m2.buy(30.0);

	}

}
