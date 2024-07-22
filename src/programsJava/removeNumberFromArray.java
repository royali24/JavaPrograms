package programsJava;

import java.util.ArrayList;

public class removeNumberFromArray {

	public static void main(String[] args) {

		// WAP to remove a particular number 'val' from given array

		int[] nums = {0,1,2,2,3,3,0,4,2};
		int val = 2;

		int len= nums.length;
		ArrayList<Integer> final_array = new ArrayList<>();

		for (int i=0; i<len; i++) {
			if(nums[i]!=val) {
				final_array.add(nums[i]);
			}

		}
		System.out.println(final_array);

		
	}

}
