package ArrayList;
import java.util.*;
public class ArratListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> city=new ArrayList<>();
city.add("Istanbul");
city.add("Ankara");
city.add("Malatya");
city.add("Bur");
ArrayList<String> longName=new ArrayList<>();
for(int i=0;i<city.size();i++) {
	if(city.get(i).length()>6) {
		longName.add(city.get(i));
		System.out.println(longName);
	}
}
	}

}
