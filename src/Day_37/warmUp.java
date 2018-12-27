package Day_37;

import java.util.ArrayList;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities=new ArrayList<>();
		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0,"Paris");
		cities.add("Pittsburgh");
		cities.add(1,"Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		System.out.println(cities.size());
		
		for(String s:cities) {
			System.out.print(s + " ");
			
		}
		System.out.print("\n");
			ArrayList<String> longNames= new ArrayList<>();
			for(int i=0;i<cities.size();i++) {
				if(cities.get(i).length()>6) {
					longNames.add(cities.get(i));
				}
			}
			System.out.println(longNames);
		}
	

}
