package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(8);
		li.add(7);
		li.add(9);
		li.add(2);
		li.add(5);
		li.add(3);
		li.add(1);
		li.add(4);
		li.add(6);
		
		li.stream().forEach(s->System.out.print(s+ " "));
		
		List<Integer> list = new ArrayList<Integer>();
		
		list= li.stream().filter(s-> (s>=6)).collect(Collectors.toList());
		list.stream().forEach(s->System.out.print(s));
		System.out.print("\n");
		
		
		//Print out even and odd numbers
		List<Integer> even_list = new ArrayList<Integer>();
		even_list= li.stream().filter(s-> (s%2==0)).collect(Collectors.toList());
		
		even_list.stream().forEach( s-> System.out.print(s+" "));
		
		System.out.print("\n");
		List<Integer> even_list1 = new ArrayList<Integer>();
		even_list1= li.stream().filter(s-> (s%2==1)).collect(Collectors.toList());
		
		even_list1.stream().forEach( s-> System.out.print(s+" "));
	}

}
