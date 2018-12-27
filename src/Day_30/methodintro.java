package Day_30;

public class methodintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello();
		askHowRU();
		reply();
		sayBye();
		sayHello("sule");
	}
public static void SayHello() {
System.out.println("Hello");
}
public static void askHowRU() {
	System.out.println("how are you ?");
}
public static void reply() {
	System.out.println("I am fine");
}
public static void sayBye() {
	System.out.println("bye");
}
public static void sayHello(String name) {
	System.out.println("hello" + " "+ name);
}
}
