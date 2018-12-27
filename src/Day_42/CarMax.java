package Day_42;

public class CarMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cars car1=new Cars();
car1.setMake("Acura");
car1.setModel("ILX");
car1.setType("sedan");
car1.setSpeed(35);

System.out.println(car1.getMake());
System.out.println(car1.getModel());
System.out.println(car1.getMake());
System.out.println(car1.getSpeed());

car1.accelerate(60);
System.out.println(car1.getSpeed());

System.out.println("========");
Cars car2=new Cars();
car2.getMake();
car2.getModel();
car2.getType();
car2.getSpeed();
System.out.println(car2.getMake());
System.out.println(car2.getModel());
System.out.println(car2.getSpeed());
System.out.println(car2.getType());

Cars car3=new Cars("Coup","Ford","Mustang");
System.out.println(car3.getMake());
System.out.println(car3.getModel());
System.out.println(car3.getSpeed());
System.out.println(car3.getType());

	}

}
