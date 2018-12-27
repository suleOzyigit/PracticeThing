package CostumClass;

import java.util.ArrayList;

public class HouseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
House h1= new House();
h1.type="Single house";
h1.adress="4231 university dr fairfax";
h1.year=1998;
h1.bedroom= 3;

House h2 = new House();
h2.bedroom = 3;
h2.type = "Single House";
h2.adress = "3456 Lee highway , Fairfax, 22031";
h2.year = 2016;

House h3 = new House();
h3.bedroom = 2;
h3.type = "Condominuim";
h3.adress = "2234 K st NW Apt 543, Washington DC 20001";
h3.year = 2015;

House whiteHouse = new House();
whiteHouse.bedroom = 132;
whiteHouse.type = "Mansion";
whiteHouse.adress = "1600 Pennsyllvania ave NW, Washington DC 20001";
whiteHouse.year = 1800;


System.out.println("house type :" + h1.type);
System.out.println("house type :" + h2.type);

System.out.println("====== create array=====");
House [] myHouse= new House[3];
myHouse[0]=h1;
myHouse[1]=h2;
myHouse[2]=h3;
System.out.println(myHouse[0].adress);
System.out.println(myHouse[0].type);
System.out.println("=== for each Loop====");
for(House h:myHouse) {
	System.out.println("House type: " + h.type + "adress : "  + h.adress);
}
System.out.println("==== for loop=======");
for(int i=0;i<myHouse.length;i++) {
	System.out.println(myHouse[i].type+ "|" + myHouse[i].adress);
}
System.out.println("====== ArrayList====");
ArrayList<House> houseList=new ArrayList<>();
houseList.add(h1);
houseList.add(h2);
houseList.add(h3);
System.out.println("");
for(House house:houseList) {
	if(house.year>=2006&&house.year<=2016) {
		System.out.println(house.year);
	}
}
	}

}
