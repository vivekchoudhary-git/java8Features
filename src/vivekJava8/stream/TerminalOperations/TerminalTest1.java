package vivekJava8.stream.TerminalOperations;

// Stream does not execute without Termnal Operations

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalTest1 {

	public static void main(String[] args) {
		
		List<String> animals = Arrays.asList("elephant","monkey","cow","wolf","lion","owl");
		// without using terminal operations
		Stream<String> filter = animals.stream().filter(str -> {
			System.out.println("filter animals : "+str);
		return	str.length() > 3;
		});
		System.out.println("----- Before Terminal Operation -----");
		
		// here using terminal operations
		List<String> filteredAnimals = filter.collect(Collectors.toList());
		System.out.println("----- After Terminal Operation -----");
		
	}
	
}
