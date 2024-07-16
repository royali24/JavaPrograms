package programsJava;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {21,3,2,2,5,6};

		int len= array.length;
		int temp=0;

		for(int i=0; i<len; i++) {
			for(int j= 1+i; j<len; j++) {


				if(array[i]>array[j]) {

					temp=array[i];
					array[i] = array[j];
					array[j]=temp;
				}
			}

			System.out.print(array[i]);
			if(i<len-1) {
				System.out.print(", ");
			}
		}
	}

}
