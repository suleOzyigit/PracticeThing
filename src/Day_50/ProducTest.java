package Day_50;

public class ProducTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product();
System.out.println(p1.toString());
Product p2=new Product("Sonny play station");
System.out.println(p2);

Electronics el = new Electronics("Dyson vacuum", 450.68);

System.out.println(el.toString());

el.buy();

System.out.println(Product.IS_AVAIABLE);
System.out.println(p1.IS_AVAIABLE);
System.out.println(el.IS_AVAIABLE);
System.out.println(Electronics.IS_AVAIABLE);
}
	}


