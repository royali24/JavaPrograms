package programsJava;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 12345;
		
		int b=0;
		
		while(num!=0) {
			b= b*10 + num%10;
			
			num= num/10;
		}
		System.out.println(b);

	}

}
