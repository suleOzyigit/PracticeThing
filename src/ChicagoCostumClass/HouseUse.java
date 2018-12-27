package ChicagoCostumClass;

public class HouseUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
House house1=new House();
house1.type="Town house";
house1.adress="3456 mapple road ";
house1.numRooms =5;
House house2=new House();
house2.type="single house";
house2.adress="3456 Arlington Road ";
house2.numRooms =7;

House house3=new House();
house3.type="Apartman";
house3.adress="2222 univeristy dr ";
house3.numRooms =3;
house1.setValues();
house2.setValues();
house3.setValues();
System.out.println(house1.type);
System.out.println(house1.adress);


	}

}
