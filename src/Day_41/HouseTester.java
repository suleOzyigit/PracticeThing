package Day_41;

public class HouseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
House yourHouse=new House();
yourHouse.type="castle";
yourHouse.address="100 Massachues ave Dc";
yourHouse.year=2018;
printHouseInfo(yourHouse);
House result=buildHouse("apartman","1234 west street Arlington" , 7, 20013);
System.out.println(result.address);
printHouseInfo(result);



	}
public static void printHouseInfo(House houseObj) {
	System.out.println("type=" + houseObj.type);
	System.out.println("Adress=" + houseObj.address);
	System.out.println("Bedroms=" + houseObj.bedrooms);
	System.out.println("year=" + houseObj.year);
}
public static House buildHouse(String type,String address,int rooms,int year ) {
	House myHouse=new House();
	myHouse.type=type;
	myHouse.address=address;
	
	myHouse.bedrooms=rooms;
	myHouse.year=year;
	return myHouse;
}
}
