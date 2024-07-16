package programsJava;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,1,3,4,5};
		int len = array.length;
		int temp = 0;

		for(int i=0; i< len; i++)
		{

			if ( array[i]>=temp) {

				temp=array[i];
			}

		}

		System.out.println(temp);
	}
}
