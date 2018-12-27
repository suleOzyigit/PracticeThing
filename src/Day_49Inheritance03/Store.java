package Day_49Inheritance03;

public class Store {
private String type;
private double rent;

public Store(String type) {
	this.type=type;
	System.out.println("Strore  constructer with  type="+ type);
}

public Store(double rent) {
	this.rent=rent;
	System.out.println("Store construter with rent" + rent);
}
public Store(String type,double rent) {
	this.type=type;
	this.rent=rent;
	
	System.out.println("Store constructer with " + type+ rent);
}



public void setRent(double rent) {
	this.rent=rent;
}
public double getRent() {
	return rent;
}
public void setType(String type) {
	this.type=type;
}
public String getType() {
	return type;
}
}
