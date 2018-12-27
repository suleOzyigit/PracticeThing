
public class Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Building b=new Building("Trump tower ","Hotel ", 5);
		System.out.println(b);
		
		SingleHouse s=new SingleHouse("My House ","Single ",3, 99.9);
       System.out.println(s);
	s.addDoor();
    s.addFloor();
	}
	 
	}


