package programsJava;

public class ArmStrongNumber {

	
	public static void main(String[] args) {
		// WAP to check if a number is armstrong number (e.g. 371 is armstrong number)

		
		int number = 371;
		int parse = number;
		int x=0;
		int  remainder;
		int total=0;
		
		//count the number of digits in the given number
		while(parse!=0) {
			x=x+1;
			parse=parse/10; 
			
		}
		System.out.println("Total digits: " +x);
		
		parse=number;
		
		while(parse!=0) {
			
			remainder = parse%10;   //1
			int b= 1;
			
			for(int i=0; i<x; i++) {
			
				b = b*remainder;  //1*
			 
			}
			total = total+b;
			parse=parse/10;
		}
		
		System.out.println("The added value: " +total );
		
		if(total==number) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
