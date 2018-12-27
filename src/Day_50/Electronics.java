package Day_50;

public class Electronics extends Product {
private double price;
public Electronics(String name,double price) {
	
	super(name);
	this.price=price;
}
 public Electronics() {
	 //setName("Unknown Electronics"); it work also
	 super("Unknown Electronics");
 }
 public String toString() {
		//return "Name: " +getName() + "Price=" + price;
	
 return super.toString()+ "price=" + price;
 
 }
 public void buy() {
		super.buy();
		System.out.println("Total price is" + price);
	}
}
