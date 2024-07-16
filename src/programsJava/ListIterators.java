package programsJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class ListIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Program iterating over a List
		// using stream.forEach() method

		// Importing all classes of
		// java.util method

		// Class


		    // Main driver method

		        // Creating an ArrayList
		        List<String> myList = new ArrayList<>();

		        // Adding elements to the List
		        // Custom inputs
		        myList.add("A");
		        myList.add("B");
		        myList.add("C");
		        myList.add("D");

		        
		        //Method 1
		        // stream.forEach() method prints
		        // all elements inside a List
		        myList.stream().forEach(elem -> System.out.println("items: " + elem));

		        //Method 2
		        Spliterator<String> spliterator = myList.spliterator();
		        spliterator.forEachRemaining(System.out::println);
		        
		        
		        //Method 3
		        
		        Iterator<String> it = myList.iterator();
		        while(it.hasNext()) {
		        	System.out.println("List with iterator:" + it.next());
		        }
		        
		        //Method 4
		        for(String st: myList) {
		        	System.out.println("Special For Loop: " + st);
		        }
		        
		        //method 5
		        
		        int listsize = myList.size();
		        System.out.println("\n");
		        for(int i=0; i<listsize; i++) {
		        	
		        	System.out.println("Simple loop: " +myList.get(i));
		        }
		    }




}
