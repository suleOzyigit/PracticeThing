package Day_42;

public class Cars {
private String type;
private String make;
private String model;
private int speed;



public Cars() {
	System.out.println("Car class constructer");

	type="sule";
     make="unknown";
      model="unknown";

}

public Cars(String type,String make,String model) {
System.out.println("3 args constructer");

this.type=type;
this.make=make;
this.model=model;
}

public  void accelerate(int mph) {
	 speed+=mph;
	 System.out.println(make+ " " +type +"is accelerate ");
}




public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	
	
	
	this.speed = speed;
}



}
