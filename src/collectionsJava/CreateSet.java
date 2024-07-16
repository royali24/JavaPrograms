package collectionsJava;

import java.util.HashSet;
import java.util.Set;

public class CreateSet {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> travelwish = new HashSet();
		travelwish.add("Venice");
		travelwish.add("Tuscany");
		travelwish.add("Edinburg");
		travelwish.add("Amsterdam");
		travelwish.add("Normandy");
		travelwish.add("Paris");

		System.out.println("Travel list city:  " + travelwish);

		//Remove a city
		travelwish.remove("Normandy");
		System.out.println("Updated Travel list city:  " + travelwish);

		//iterate through all cities to find an element
		iterateSetValues(travelwish);
	}

	private static void iterateSetValues(Set<String> travelwish) {
		// TODO Auto-generated method stub
		System.out.println("Iterating through the travel wish list");
		for(String s : travelwish) {

			//System.out.println(s);

			if(s.equalsIgnoreCase("Paris")) {
				System.out.println("Found my favourite city : " + s);
			}
		}
	}

}
