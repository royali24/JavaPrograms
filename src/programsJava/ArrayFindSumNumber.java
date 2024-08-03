package programsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayFindSumNumber {

	public static void main(String args[]) {
		
		int[] arr = {1,8,19,4,7,23,6};
		
		int sum = 23;
		
		int add_sum;
		
		for (int i=0; i< arr.length; i++) 
		{
			
			for (int j= i+1; j<arr.length; j++) {
				
				add_sum = arr[i]+arr[j];
				
				if(add_sum==sum) {
					System.out.println("The numbers are: " +arr[i] +" and " +arr[j]);
					break;
				}
				
			}
			
		}

	}

}
