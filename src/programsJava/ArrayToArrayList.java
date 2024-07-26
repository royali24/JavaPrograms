package programsJava;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {2,1,3,2,1,5,87,7};
		
		int len = array.length;
		
		ArrayList<Integer> alist= new ArrayList<Integer>();
		
		for(int i=0; i<len; i++) {
			
			alist.add(array[i]);
			
		}
		System.out.println(alist);
	}

}
