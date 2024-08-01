package collectionsJava;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("USA", "Washington");
		map.put("France", "Paris");
		map.put("UK", "London");
		map.put("India", "Delhi");
		
		System.out.println("The map entered:" + map.entrySet());
		
		System.out.println("The map keys:" + map.keySet());
		
		System.out.println("The map values:" + map.values());
		
		for(String s: map.keySet()) {
			System.out.println("Key: " +s + " \nValue: " + map.get(s));
		}
		
		if(map.containsKey("USA")) {
			System.out.println("The found value of USA : " +map.get("USA"));
		}else {
			System.out.println("Key not found");
		}
		
		if(map.containsValue("Paris")) {
			System.out.println("Found value");
		}
		else {
			System.out.println("Value not found");
		}
	}

}
