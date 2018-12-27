
public class SingleHouse extends Building {

	
	double hoaFee;
	
	public SingleHouse(String name, String type, int floorCount,double hoaFee) {
    super( name, type, floorCount);
    this.hoaFee=hoaFee;
		
//		super.setName(name);
//		super.setType(type);
//		super.setFloorCount(floorCount);
//		this.hoaFee=hoaFee;
		
	
	
	}
	@Override
	public String toString() {
		return super.toString()+hoaFee+"--- Single House";
	}
	
	
	
	
	@Override
	
	public void addDoor() {
		super.addDoor();
	//super.addDoor();
	System.out.println("adding door for single hpouse");
	}
	
	@Override
	public void addFloor() {
		super.addFloor();
		System.out.println("Adding floor for single house");
	}
}
