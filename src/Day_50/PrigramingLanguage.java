package Day_50;

public class PrigramingLanguage extends language {
	public String name="Progrwaming  language java";

public void printProgramingName() {
	System.out.println("Programing Language L" + name);
}
public static void staticMethod() {
	System.out.println(" Programing Languane static method ay child class");
}
public void printName() {
	System.out.println("Language=" + name);
	staticMethod();
}
}
