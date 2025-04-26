package vivekJava8.biFunction;

//refer Youtube Engineering Digest playlist Java8 16/21

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		// using BiFunction Interface abstract method apply()
		BiFunction<String, String, Integer> biFunction = (str1,str2) -> str1.length()+str2.length();
		Integer res1 = biFunction.apply("bharat", "mahan");
		System.out.println("res1 : "+res1);
		
		// using BiFunction Interface default method andThen()
		Function<Integer, String> function = x -> "final result is : "+2*x;
		String res2 = function.apply(5);
		System.out.println("res2 : "+res2);
		
		BiFunction<String, String, String> andThenBifunction = biFunction.andThen(function);                       // here biFunction output value will be taken as input value for function
		String res3 = andThenBifunction.apply("chak", "de");
		System.out.println("res3 : "+res3);
		
		
	}
	
}
