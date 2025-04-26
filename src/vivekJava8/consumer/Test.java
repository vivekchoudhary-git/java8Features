package vivekJava8.consumer;

//refer Youtube Engineering Digest playlist Java8  14/21

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		// using Consumer Interface abstract method accept()
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("cricket");
		
		// using Consumer Interface default method andThen()
		Consumer<List<Integer>> consumer1 = li -> {
			
			for(Integer i : li){
				
				System.out.println(i+100);
			}
			
		};
		
		Consumer<List<Integer>> consumer2 = li -> {
			
			for( Integer i : li){
				
				System.out.println(i);
			}
			
		};
		
		Consumer<List<Integer>> consumerAndThen = consumer1.andThen(consumer2);                     // first consumer1 will run and later consumer2
		consumerAndThen.accept(Arrays.asList(1,2,3,4));                                                         // here accept method is overriden inside andThen() method...study more
		
	}
	
}
