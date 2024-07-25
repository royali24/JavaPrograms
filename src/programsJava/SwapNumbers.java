package programsJava;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =5;
		int b=6;
		
		a=a+b;
		b=a-b; // 11-6=5
		a=a-b; // 11-5 =6
		System.out.println("a = " +a);
		System.out.println("b = "+ b);
	}
}
