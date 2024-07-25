package programsJava;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,2,3,4,4,5,6,6};
		List<Integer> unique_numbers= removeDuplicates(arr);
		System.out.println(unique_numbers);
		
		
		List<Integer> li_1 = new ArrayList<>();
		li_1.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {

				if(li_1.contains(arr[i])) {
				
			}
			else {
				li_1.add(arr[i]);
			}
		}

		System.out.println("Achieved after removing: " + li_1);

	}
//most effective way
	public static List<Integer> removeDuplicates(int[] nums) {
		int length = nums.length;
		System.out.println("length of array: " +length);

		List<Integer> li = new ArrayList<>();
		for(int i=0; i<length; i++) {
			if(!li.contains(nums[i])) {
				li.add(nums[i]);
				
			}
		}

		return li;
	}



}
