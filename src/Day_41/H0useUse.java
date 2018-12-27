package Day_41;

import java.util.ArrayList;
import java.util.Arrays;

public class H0useUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
House house1=new House();
house1.bedrooms=3;
house1.type="town House";
house1.address="123 Main st,Strerling VA 2222";
house1. year=2010;


House house2 = new House();
house2.bedrooms = 3;
house2.type = "Single House";
house2.address = "3456 Lee highway , Fairfax, 22031";
house2.year = 2014;

House house3 = new House();
house3.bedrooms = 2;
house3.type = "Condominuim";
house3.address = "2234 K st NW Apt 543, Washington DC 20001";
house3.year = 2014;

House whiteHouse = new House();
whiteHouse.bedrooms = 132;
whiteHouse.type = "Mansion";
whiteHouse.address = "1600 Pennsyllvania ave NW, Washington DC 20001";
whiteHouse.year = 1800;
System.out.println("House1 type= "+ house1.type);
System.out.println("House2 type:" + house2.type);
System.out.println("House2 type:" + house3.type);
System.out.println("whiteHouse type:" + whiteHouse.type);	
House EsqersHouse = new House();
EsqersHouse.type = "Townhouse";
EsqersHouse.address = "4321 Jones St, Tysons VA 22102";
EsqersHouse.bedrooms = 3;
EsqersHouse.year = 1980;



House[]	houses=new House[5];

houses[0] = house1;
houses[1] = house2;
houses[2] = house3;
houses[3] = whiteHouse;
houses[4] = EsqersHouse;
for(House h:houses ) {
	System.out.println(h.type + "=>" + h.address);
}
System.out.println("with for loop");
System.out.println("\n");


for(int i=0;i<houses.length;i++) {
	System.out.println(houses[i].type);

	System.out.println(houses[i].address);
	
}


System.out.println("with ArrayList");
System.out.println("\n");

ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));
for(int i=0;i<houseList2.size();i++) {
	if(houseList2.get(i).year>2006&&houseList2.get(i).year<2016) {
		System.out.println(houseList2.get(i).year);	
	}
}
// i can create a method here to but is is so full I will use another class to dat 
	}

}
