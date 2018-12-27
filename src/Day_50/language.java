package Day_50;

public class language {
public String name="general language";
public static void staticMethod() {
	System.out.println("Languane static method");
}
public void printName() {
	System.out.println("Language=" + name);
	staticMethod();
}
}
