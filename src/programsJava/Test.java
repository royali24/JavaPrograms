package programsJava;


public class Test {

	public static void main(String args[]) {
		
		int[] array = {1,12,6,3,4,5};
		
		int temp=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(temp<array[i]) {
				temp=array[i];
			}
		}
		
		System.out.println(temp);
	}
	
}
