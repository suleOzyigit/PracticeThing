package Day_49Inheritance03;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Store s1=new Store("Grocery");
Store s2=new Store(10000.55);
Store s3=new Store("Computer Store", 3456.78);
	System.out.println("======PetSmart=======");
	
	
	PetSmart petSmart1=new PetSmart();
	
	System.out.println("========PetSmart2=======");
	PetSmart petSmart2=new PetSmart(345566.90);
	System.out.println("PetSmart1 type " +petSmart1.getType());
	System.out.println("PetSmart2 type " +petSmart2.getType());
	System.out.println("Store1 type " +s1.getType());
	
	}

}
