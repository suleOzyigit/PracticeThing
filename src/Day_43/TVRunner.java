package Day_43;

public class TVRunner {

	public static void main(String[] args) {
		//
		
		
		//TODO Auto-generated method stub
Tv myTv=new Tv();
Tv smartTv=new Tv("Sharp");
System.out.println(myTv.isOn());
System.out.println(smartTv.isOn());
myTv.turnOn();
System.out.println(myTv.isOn());
smartTv.turnOn();
System.out.println(smartTv.isOn());
myTv.turnOn();


myTv.setChannel(20);
smartTv.setChannel(55);

System.out.println("My tv =" + myTv.getChannel());
System.out.println(" smart Tv="+smartTv.getChannel());	
	myTv.channelUp();
	System.out.println("My tv =" + myTv.getChannel());
	
	smartTv.channelDown();
	System.out.println(" smart Tv="+smartTv.getChannel());
	
	
	}

}
