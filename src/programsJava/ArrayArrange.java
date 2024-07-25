package programsJava;

import java.util.ArrayList;
import java.util.List;


public class ArrayArrange {

	public static void main(String[] args) {
		// TODO Arrange the array such that all 0s come at the end and rest of the order is maintained


		int[] array= {1, 0, 32, 0, 0 ,9, 45, 8, 0, 3, 0, 6, 0, 0, 5};


		int length = array.length;

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();


		for(int i=0; i<length; i++) {

			if(array[i]!=0) {
				l1.add(array[i]);
			}
			else {
				l2.add(array[i]);
			}
		}
		List<Integer> finalList = new ArrayList<Integer>();

		finalList.addAll(l1);
		finalList.addAll(l2);
		System.out.println(finalList);

	}

}
