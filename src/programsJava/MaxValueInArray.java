package programsJava;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,1,6,3,4,5};
		int len = array.length;
		int temp = 0;

		for(int i=0; i< len; i++)
		{

			if ( array[i]>=temp) {

				temp=array[i];
			}

		}

		System.out.println(temp);
		
		
		int temp_1= array[0];
		for(int i: array) {
			
			if(temp_1<i) {
				temp_1=i;
			}
		}
		System.out.println("Largest value via for each loop: "+temp_1);
	}
}
