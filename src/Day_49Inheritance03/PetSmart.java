package Day_49Inheritance03;

public class PetSmart extends Store {
public PetSmart() {
	super("PetStore ");
	System.out.println("PetSmart no arg Constructer");
}
public PetSmart(double rent) {
	super("PetStore",rent);
	System.out.println("PetSmart  construter with rent" + rent);
}
}
