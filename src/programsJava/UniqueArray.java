package programsJava;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,2,3,4,4,5,6,6};
		List<Integer> unique_numbers= removeDuplicates(arr);
		System.out.println(unique_numbers);

	}

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
