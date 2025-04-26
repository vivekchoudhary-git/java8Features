package vivekJava8.biConsumer;

//refer Youtube Engineering Digest playlist Java8 16/21

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		
		// using Biconsumer Interface abstract method accept()
		BiConsumer<Integer, Integer> biConsumer1 = (x,y) -> System.out.println("biConsumer1 : "+(x+y));
		biConsumer1.accept(40, 50);
		
		// using Biconsumer Interface default method andThen()
		BiConsumer<Integer, Integer> biConsumer2 = (x,y) -> System.out.println("biConsumer2 : "+(x*y));
		biConsumer2.accept(40, 50);
		
		BiConsumer<Integer, Integer> andThenBiConsumer = biConsumer1.andThen(biConsumer2);             // first biConsumer1 will run after that biConsumer2 will run
		andThenBiConsumer.accept(15, 10);
		
		
	}
	
}
