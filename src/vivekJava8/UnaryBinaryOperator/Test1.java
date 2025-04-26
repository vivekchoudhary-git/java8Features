package vivekJava8.UnaryBinaryOperator;

// refer Youtube Engineering Digest playlist Java8  17/21
// here we are learning BinaryOperator Interface

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test1 {

	public static void main(String[] args) {
		
		// BinaryOperator Interface extends BiFunction Interface
		// in BiFunction Interface when input and output parameter data type is same like integer or String then we can use BinaryOperator Interface
		BiFunction<Integer, Integer, Integer> biFunction1 = (x,y) -> x*y;
		Integer res1 = biFunction1.apply(7, 8);
		System.out.println("res1 : "+res1);
		
		BinaryOperator<Integer> binaryOperator1 = (x,y) -> x*y;
		Integer res2 = binaryOperator1.apply(7, 8);
		System.out.println("res2 : "+res2);
		
		BiFunction<String, String, String> biFunction2 = (str1,str2) -> str1+str2;
		String res3 = biFunction2.apply("hello", " world");
		System.out.println("res3 : "+res3);
		
		BinaryOperator<String> binaryOperator2 = (str1,str2) -> str1+str2;
		String res4 = binaryOperator2.apply("hello", " world");
		System.out.println("res4 : "+res4);
		
	}
	
}
