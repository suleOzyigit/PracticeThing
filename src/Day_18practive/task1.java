package Day_18practive;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String SMSmessage=new String("Sender:<Shaun Smith>. From Number:[312-123-3456]. Message:{I love programing and problem solving. Java is fun}");
String sender, phoneNumber,message;

sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">"));
System.out.println(sender);
phoneNumber=SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
System.out.println(phoneNumber);
message=SMSmessage.substring(SMSmessage.indexOf("{")+1,SMSmessage.indexOf("}"));
System.out.println(message);
System.out.println("====================Task two====================");
String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
garage=garage.toLowerCase();
if(garage.isEmpty()) {
	System.out.println("there is no car in the garage");
}
if(garage.contains("toyota")||garage.contains("nissan")) {
	System.out.println("There is a japenese car in the garage");
}else {
	System.out.println("Thre is no car in the garage");
}
if(garage.indexOf("bmw")>-1) {
	System.out.println("There is a German car in the garage");
	}else {
		System.out.println("Thre is no  German car in the garage");
}

if(garage.indexOf("mazerati")>-1) {
	System.out.println("There is a italian car in the garage");
	}else {
		System.out.println("Thre is no  italian car in the garage");
}
	}

}
