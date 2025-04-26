package vivekJava8.stream;

//refer Youtube Engineering Digest playlist Java8 19/21
//Basic Concepts Part-3 

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> newList = Stream.iterate(0, n -> n+1)
				.limit(101)
				.filter(n -> n%2 ==0)
				.peek(n -> System.out.println("peek : "+n))
				.collect(Collectors.toList());
		
		System.out.println("newList : "+newList);
		
	}
	
}
