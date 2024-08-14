package programsJava;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "royali roy r r";
		
		String[] ch = str.split("");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
	
		for(int i=0; i< ch.length; i++) {
			
			
			if(map.containsKey(ch[i])) {
				int count = map.get(ch[i]);
				count = count +1;
				map.put(ch[i], count);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		
		System.out.println(map);
	}

}
