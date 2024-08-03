package programsJava;

public class PlayWithPrimeNumbers {

	public static void main(String[] args) {
		//WAP to print prime numbers between 2 to 100 excluding those numbers which contains 3 or 7 in it.

		int num = 29;
		int parse = num;
		int flag=0;
		int remainder;

		while(parse!=0) {
			remainder = parse%10;
			if(remainder==3||remainder==7) {
				flag=1;
			}

			parse=parse/10;
		}
		if(flag==1) {
			System.out.println("Not calculated as number contains 3 or 7");
		}
		if(flag==0) {
			int x=1;
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					System.out.println("Not prime");
					x=0;
					break;
				}
				else {
					x=1;
				}
			}

			if(x==1) {
				System.out.println("prime");
			}
		}
	}


}
