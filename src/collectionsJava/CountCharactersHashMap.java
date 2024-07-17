package collectionsJava;

import java.util.*;

public class CountCharactersHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "my Name is Royalieeeie Rrroyyy";
		str= str.toLowerCase();
		
		String[] alphabet= str.split("");
		
		int char_length = alphabet.length;
		
		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		
		for(int i=0; i< char_length; i++) {
			
			int count=1;
			
			if(smap.containsKey(alphabet[i])) {
				
				count = smap.get(alphabet[i]);
				smap.put(alphabet[i], count+1);
			}
			else {
				smap.put(alphabet[i], 1);
			}
			
		}
		System.out.println(smap);
		
		for(String key : smap.keySet()) {
			
			if(smap.get(key)>2 && !key.equalsIgnoreCase(" "))
		
		    System.out.println(key +"--" +smap.get(key));
		}
	
		
		//Another way 
		
		Set<String> set = new HashSet<String>();
		set.addAll(smap.keySet());
		
		Iterator<String> it = set.iterator();
		//int size= set.size();
		
		
		while(it.hasNext()) {
		
			String key= it.next();
			int value = smap.get(key);
			
			if(value>2 && !key.equalsIgnoreCase(" ")) {
				System.out.println(key +"--" +smap.get(key));
			}
		
		}
		
		
		
		//Another way 
		
		ArrayList<String> arr= new ArrayList<String>(smap.keySet());
		
		int map_item_count= smap.keySet().size();
		
		for(int i=0; i<map_item_count; i++ )
		{
			
			String key = arr.get(i);
			int value= smap.get(key);
			
			if(value>2 && !key.equalsIgnoreCase(" ")) {
				System.out.println(key +"--" +smap.get(key));
			}
		
		}
		
	}

}
