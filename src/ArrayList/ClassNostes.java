package ArrayList;
import java.util.*;
import java.util.ArrayList;


public class ClassNostes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> fruits1=new ArrayList<>();
fruits1.add("Grapes");
fruits1.add("Tomato");
fruits1.add("BlueBerries");
fruits1.add("BlackBerries");
fruits1.add(0,"Orange");
fruits1.add(4,"sule");
System.out.println(fruits1);
List<String> fruits2=new ArrayList<>();
fruits2.addAll(fruits1);
fruits2.add("Dragon fruit");
System.out.println(fruits2);
fruits1.remove(0);
System.out.println(fruits1);
fruits2.removeAll(fruits1);
System.out.println(fruits2);
fruits2.clear();
System.out.println(fruits2);
	}

}
