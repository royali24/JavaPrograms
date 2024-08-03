package games;

public class FizzBuzz {

	public static void main(String[] args) {
		/*  FizzBuzz. Print numbers from 1 to 100
		- If a number is divisible by 3 print Fizz
		- If a number is divisible by 5 print Buzz
		- If a number is divisible by both 3 and 5 print FizzBuzz*/
		
		int num= 13;
		
		if(num%3==0) {
			
			if(num%5==0) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println("Fizz");
			}
			
		}
		else if(num%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println("Nothing hahaha");
		}

	}

}
