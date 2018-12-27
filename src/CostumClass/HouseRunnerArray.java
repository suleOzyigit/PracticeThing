package CostumClass;

import java.util.ArrayList;

public class HouseRunnerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HouseArray house1= new HouseArray();
house1.type="town House";
house1.bedroom=5;
house1.year=2016;
HouseArray house2= new HouseArray();
house2.type="Single House";
house2.bedroom=4;
house2.year=2017;
ArrayList<HouseArray> houseList=new ArrayList<>();
houseList.add(house1);
houseList.add(house2);
//for(HouseArray h:houseList) {
//	System.out.println(h.type);
//	System.out.println(h.year);
//}
for(int i=0;i<houseList.size();i++) {
	System.out.println(houseList.get(i).type);
}
	}

}
