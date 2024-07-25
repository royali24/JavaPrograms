package programsJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String args[]) {
		
		int[] array = {2,1,32,2,2,5,6};
		
		int temp=array[0];
		
		for(int i: array) {
			if(temp<i) {
				temp=i;
			}
		}
		System.out.println(temp);
	}
}
