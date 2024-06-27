package programsJava;

public class SpecialArray {

	public static void main(String[] args) {
		// determine if the given array is special array
		
		int[] array = {21, 32, 45, 62, 75, 82};
		int length = array.length;
		int flag =0;
	
		
		for (int i=0; i<length-1; i++) {
			
			
			//int j = parity(array[i]);
			//System.out.println("the mod value of " + array[i] +" is: " +j);
			//int x= i+1;
			//int y = parity(array[i+1]);
			//System.out.println("the mod value of " + array[x] +" is: " +y);
			
			if(parity(array[i])!=parity(array[i+1])) {
				flag =1;
			}
			else {
				flag =0;			
			}		
		}
		
		if(flag ==1) {
			System.out.println("this is a special array");
		}
		else {
			System.out.println("this is not a special array");
		}
	}

	private static int parity(int x) {
		
		int value = (x)%2;		
		return value;
		
	}

}
