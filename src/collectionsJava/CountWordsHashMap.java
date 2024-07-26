package collectionsJava;

import java.util.HashMap;
import java.util.Map;

public class CountWordsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str= "Training Training course and certification course in Testing Training course";

		String[] words = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < words.length ; i++) {
			if (map.containsKey(words[i])) {
				int count = map.get(words[i]);
				
				//System.out.println(words[i]+ count);
				
				map.put(words[i], count + 1);
				
			}
			else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);

		
		//Another Way of writing for loop
		/*
		for (String s: words) {
			if (map.containsKey(s)) {
				int count = map.get(s);
				
				//System.out.println(words[i]+ count);
				
				map.put(s, count + 1);
				
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
		*/
	
		
	}


}

