package ChicagoConstructers;

public class Car {
String make;
int year;
boolean  sportEdition;
int millage;
 
public void drive() {
	System.out.println(year+ " " +make + " is driving");
	millage+=10;
	//System.out.println();
}
public void drive(String destination) {
	System.out.println(year+ "" +make+ "is driving to  " + destination);
millage+=10;

}
public void drive(int miles) {
	System.out.println(year+ "" +make+ "is driving to  " + miles);
	this.millage+=millage;
}
}
