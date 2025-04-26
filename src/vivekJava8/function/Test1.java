package vivekJava8.function;

//refer Youtube Engineering Digest playlist Java8 13/21
//Java 8 Function Interface Explained: How to Use apply(), andThen(), compose() and identity()

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function1 = x -> 2*x;
		Function<Integer, Integer> function2 = x -> x*x*x;
		
		Integer res1 = function1.apply(2);
		System.out.println("res1 : "+res1);
		
		Integer res2 = function2.apply(2);
		System.out.println("res2 : "+res2);
		
		// using Function Interface default method andThen();
		
		Function<Integer, Integer> functionAndThen = function1.andThen(function2);       // here function1 will be called first and then its value will be used as input in function2
		Integer res3 = functionAndThen.apply(2);                                                              // apply() method is overriden inside andThen() method ...study more about this                    
		System.out.println("res3 : "+res3);
		
		Function<Integer, Integer> functionAndThen1 = function2.andThen(function1);       // here function2 will be called first and then its value will be used as input in function1
		Integer res4 = functionAndThen1.apply(2);                                                              // apply() method is overriden inside andThen() method ...study more about this                    
		System.out.println("res4 : "+res4);
		
		// using Function Interface default method compose();
		Function<Integer, Integer> functionCompose = function1.compose(function2);         // here function2 will be called first and then its value will be used as input in function1
		Integer res5 = functionCompose.apply(2);                                                               // apply() method is overriden inside andThen() method ...study more about this   
		System.out.println("res5 : "+res5);
		
		// using Function Interface static method identity()
		Function<Object, Object> functionIdentity = Function.identity();
		Object res6 = functionIdentity.apply("bumrah");
		System.out.println("functionIdentity res6 : "+res6);
		
	}
	
}
