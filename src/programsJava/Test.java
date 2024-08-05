package programsJava;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,5,4,3,2,1};
		int val=5;
		
		ArrayList<Integer> arlist= new ArrayList<Integer>();
		
		for (int i=0;i< arr.length; i++) {
			
			if(arr[i]!=val) {
				
				arlist.add(arr[i]);
				
			}
			
		}
		
		System.out.println(arlist);
	}

}
