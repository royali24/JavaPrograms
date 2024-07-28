package collectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set= new HashSet<String>();
		set.add("Royali");
		set.add("mindblowing");
		set.add("Genious");
		set.add("fantabulous");
		
		
		List<String> list= new ArrayList<String>();
		list.addAll(set);
		
		
		//sorting set
		
		Collections.sort(list);
		System.out.println(list);
	
	}

}
