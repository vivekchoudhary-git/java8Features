package vivekJava8.UnaryBinaryOperator;

// refer Youtube Engineering Digest playlist Java8  17/21
// here we are learning UnaryOperator Interface

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {
		
		// UnaryOperator extends Function Interface
		// In Function Interface when input and output both are of same type like integer or String than we can use UnaryOperator
		Function<Integer, Integer> function1 = x -> x*x;
		Integer res1 = function1.apply(3);
		System.out.println("res1 : "+res1);
		
		UnaryOperator<Integer> unaryOperator1 = x -> x*x;
		Integer res2 = unaryOperator1.apply(3);
		System.out.println("res2 : "+res2);
		
		Function<String, String> function2 = str -> str.toUpperCase();
		String res3 = function2.apply("bharat");
		System.out.println("res3 : "+res3);
		
		UnaryOperator<String> unaryOperator2 = str -> str.toUpperCase();
		String res4 = unaryOperator2.apply("bharat");
		System.out.println("res4 : "+res4);
		
	}
	
}
