package java8features;

import java.util.function.BiConsumer;

public class AddFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer, Integer> biconsumer= (a,b)->System.out.println(a+b);
		biconsumer.accept(5,10);

	}

}
