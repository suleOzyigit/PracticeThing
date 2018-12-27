package Day_34;

public class argsVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoppingList("rice","meat","salt","banana");
	}
public static void shoppingList(String...list) {
	System.out.print("shopping list;");
	for(String item:list) {
		
		System.out.print(item + " ");
	}
}
}
