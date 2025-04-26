package vivekJava8.supplier;

//refer Youtube Engineering Digest playlist Java8 15/21
// Here we are Revising Predicate,Function,Consumer and Supplier Interface concepts

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = x -> x%2 == 0;
		Function<Integer, Integer> function = x -> x*x;
		Supplier<Integer> supplier = () -> 10;
		Consumer<Integer> consumer = x -> System.out.println(x);
		
		if(predicate.test(supplier.get())){
			Integer res = function.apply(supplier.get());
			consumer.accept(res);
		}
		
	}
	
}
