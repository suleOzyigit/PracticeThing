package CostumClass;

public class Movie {

	String name;
	int length;
	public void watch() {
		System.out.println("I am watching " + name);
		System.out.println("movie is " + length + "minutes");
	}
	public void buy(double price) {
		System.out.println("price of movie" + name  + price );
	}
}
