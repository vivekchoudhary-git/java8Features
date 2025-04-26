package vivekJava8.stream;

// refer Youtube Engineering Digest playlist Java8 19/21
// Basic Concepts Part-1

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		// How to create Stream from List
		List<String> players = Arrays.asList("ganguly","nehra","harbhajan","kaif");
		Stream<String> stream = players.stream();
		
		//How to create Stream from Array
		String[] players1 = {"ganguly","nehra","harbhajan","kaif"};
		Stream<String> stream1 = Arrays.stream(players1);
		
		//How to directly create Stream
		Stream<String> stream2 = Stream.of("ganguly","nehra","harbhajan","kaif");
		
		// Print numbers from 0 to 9
		Stream.iterate(0, n -> n+1).limit(10).forEach(System.out :: println);
		
		// Generate random number of 10 digits
		Stream.generate(() -> new Random().nextInt(10)).limit(10).forEach(System.out :: print);
		
	}
	
}
