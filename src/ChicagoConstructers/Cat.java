package ChicagoConstructers;

public class Cat {
	String breed;
	String gender;
	
	
	boolean shy;
	int age;
	String color;
	String behaviour;
	
	public Cat() {
		
	}
	
	
public Cat(String gender,String breed) {
System.out.println("cat is going to eat");	
//System.out.println(gender);
//System.out.println(breed);

this.gender=gender;
this.breed=breed;
}
public void eat() {
	System.out.println("cat is eating");
}
}
