package programsJava;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6,5,8,3,4,2};


		sortArrayLowesttoHighest(arr);
		System.out.println("\n");
		sortArrayHighesttoLowest(arr);

	}

	private static void sortArrayHighesttoLowest(int[] array) {
		int len = array.length;
		int temp = 0;
		
		System.out.print("{");
	
		for( int i=0; i<len; i++){
			for (int j= i+1; j<len; j++){

				if(array[i]<array[j]){

					temp= array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
			System.out.print(array[i]);
			if(i<len-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}



	private static void sortArrayLowesttoHighest(int[] array) {
		int len = array.length;
		int temp = 0;
		
		System.out.print("{");
	
		for( int i=0; i<len; i++){
			for (int j= i+1; j<len; j++){

				if(array[i]>array[j]){

					temp= array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
			System.out.print(array[i]);
			if(i<len-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}

}
