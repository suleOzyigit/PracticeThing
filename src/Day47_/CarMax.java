package Day47_;

public class CarMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle v1=new Vehicle(); 
	v1.makeAnModel="toyate ";
	v1.year=2018;
	v1.maxSpeed=140;
v1.drive();
v1.stop();
Car car=new Car();
car.makeAnModel="toyate prius ";
car.year=2015;
car.maxSpeed=120;
car.drive();
car.stop();
car.doUber();
System.out.println(v1.makeAnModel);
System.out.println(v1.year);
System.out.println(v1.maxSpeed);
System.out.println(car.makeAnModel);
System.out.println(car.year);
System.out.println(car.maxSpeed);
System.out.println("====Train====");
Train train=new Train();
train.ticket=28.90;
train.leaveStation();
train.makeAnModel="Cyber Train 10";
System.out.println("train ticket="+ train.ticket);
System.out.println(train.makeAnModel);
	}

}
