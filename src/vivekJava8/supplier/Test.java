package vivekJava8.supplier;

// refer Youtube Engineering Digest playlist Java8 15/21

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		// using Supplier Interface abstract method get();
		Supplier<String> supplier = () -> "play sports";
		String res = supplier.get();
		System.out.println("supplier res  :  "+res);
		
	}
	
}
