package Day_50;

public class Product {
private String name;

public static final boolean IS_AVAIABLE=true;


  public Product() {
	  this("unknown");
	  
  }

public Product( String name) {
	  this.name=name;
  }


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String toString() {
	return "Name: " +name ;
}
public void buy() {
	System.out.println("Buying Product" + name );
}
}
