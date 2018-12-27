package Day_30;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cook("pasta");
youWillNeed("pasta, oil, salt, paper");
youWillNeed("paste");
youWillNeed("oil");
cookFoor(30,"boiling");
ready();
	}
public static void cook(String foodName) {
	System.out.println("we are going to cook " + " " + foodName);
}
public static void youWillNeed(String items) {
	System.out.println("we need fallowing items:" + items);
}
public static void cookFoor(int minutes,String wayOfCooking) {
	System.out.println( "you need to cook= " + " " + minutes + "by " + " "+ wayOfCooking);
}
public static void ready() {
	System.out.println("dinner is ready");
}

}
