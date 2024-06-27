package programsJava;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {21,3,2,2,5,6};
		int len= array.length;
		String temp = "";
		
		for (int i=len-1; i>=0;i--) {
			
			temp = temp + array[i];
			if(i>0 ) {
				temp = temp+ ", ";
			}
		}
		System.out.print(temp);
		
	}

}
