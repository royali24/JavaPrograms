package programsJava;

import java.util.Arrays;
import java.util.Collections;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,1,6,3,4,5};
	
		//First way
		int len = array.length;
		int temp = 0;
		for(int i=0; i< len; i++)
		{
			if ( array[i]>=temp)
			{
				temp=array[i];
			}
		}
		System.out.println(temp);
		
		//second way
		int temp_1= array[0];
		for(int i: array) {
			
			if(temp_1<i) {
				temp_1=i;
			}
		}
		System.out.println("Largest value via for each loop: "+temp_1);
		
		//3rd way
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
		//Fourth way
		Integer[] arr = {1,1,6,3,4,5};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[0]);		
	}
}
