package programsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String args[]) {
		
		int[] array = {1,4,7,12,3,6,3,4,5};
		int flag =0;

		
		for(int i=0; i<array.length-1; i++) {
			
			int x= array[i]%2;
			int y = array[i+1]%2;
			
			if(x==y) {
				System.out.println("not Special");
				 flag =1;
				break;
			}
			
		}
		if(flag == 0) {
			
				System.out.println(" Special");
			
		}
	}
}
