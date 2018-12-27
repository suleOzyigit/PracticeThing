package CostumClass;

public class CellPhonerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CellPhone p1=new CellPhone();
CellPhone p2=new CellPhone();
p1.brand="apple XS";
p1.colar="red";
p1.price=999.99;


p2.brand="Ericson 1018";
p2.colar="blue";
p2.price=1199.99;

p1.call();
p1.text();
//p2.call();
//p2.text();
System.out.println("Phone1 brand"+p1.brand  + p1.colar + p1.price);
System.out.println("Phone 2 barand"+p2.brand  + p2.colar +p2.price);

	}

}
