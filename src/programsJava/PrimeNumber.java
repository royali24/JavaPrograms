package programsJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Write a Java program to check if the given number is a prime number.

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check if it is prime or not");
		
		num= scan.nextInt();
				
		int flag=0;
		int len = num/2;
		
		for(int i=2;i<=len;i++) {
			
			if(num%i==0) {
				System.out.println("Divisible by: " +i);
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("Not a Prime number");
		}
		else {
			System.out.println("Prime number");
		}
	}

}
