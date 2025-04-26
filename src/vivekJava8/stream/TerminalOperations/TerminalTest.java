package vivekJava8.stream.TerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Ternary Operations of Streams are collect,forEach,reduce,count,anyMatch, allMatch, noneMatch,findFirst, findAny,toArray,min,max,forEachOrdered

public class TerminalTest {

	public static void main(String[] args) {
		
		// collect
		List<Integer> numbers = Arrays.asList(7,5,4,9,8,7,4,12,5);
		List<Integer> collectList = numbers.stream().map(x -> x=x+x).collect(Collectors.toList());
		System.out.println("collectList : "+collectList);
		
		// forEach
		List<String>  animals = new ArrayList<>();
		animals.add("dog");
		animals.add("horse");
		animals.add("kangaroo");
		animals.add("tortoise");
		
		animals.stream().forEach(str -> System.out.println("animals : "+str));
		
		// reduce
		Optional<Integer> optionalReduceNumb = numbers.stream().reduce((x,y) -> x+y);
		Integer reduceNumbers = optionalReduceNumb.get();
		System.out.println("reduceNumbers : "+reduceNumbers);
		
		// count
		long countNumbers = numbers.stream().count();
		System.out.println("countNumbers : "+countNumbers);
		
		// anyMatch
		// it would return true if any elements in numbers list will be an even number
		boolean anyMatchNumbers = numbers.stream().anyMatch(x -> x%2 == 0);
		System.out.println("anyMatchNumbers : "+anyMatchNumbers);
		
		// allMatch
		// it would return true if all elements in numbers list will be an even number
		boolean allMatchNumbers = numbers.stream().allMatch(x -> x%2 == 0);
		System.out.println("allMatchNumbers : "+allMatchNumbers);
		
		// noneMatch
		// it would return true if none of the elements in numbers list will be less than zero.
		boolean noneMatchNumbers = numbers.stream().noneMatch(x -> x < 0);
		System.out.println("noneMatchNumbers : "+noneMatchNumbers);
		
		// findFirst
		// it will give first element of the list
		Optional<String> optionalFindFirst = animals.stream().findFirst(); 
		String findFirst = optionalFindFirst.get();
		System.out.println("findFirst : "+findFirst);
		
		// findAny
		// it will give any element from the list
		Optional<String> optionalFindAny = animals.stream().findAny();
		String findAny = optionalFindAny.get();
		System.out.println("findAny : "+findAny);
		
		// toArray
		// The toArray() method of a Java Stream is used to collect all the elements of the stream into an array.
		Stream<Integer> streamNumbers = Stream.of(1,9,4,17,2,33);
		Object[] toArray = streamNumbers.toArray();
		System.out.println("toArray : "+Arrays.toString(toArray));
		
		// min
//		Optional<Integer> optionalMinNumber = numbers.stream().min(Comparator.naturalOrder());
		Optional<Integer> optionalMinNumber = numbers.stream().min((a,b) -> a-b);
		Integer minNumber = optionalMinNumber.get();
		System.out.println("minNumber : "+minNumber);
		
		// max
//		Optional<Integer> optionalMaxNumber = numbers.stream().max(Comparator.naturalOrder());
		Optional<Integer> optionalMaxNumber = numbers.stream().max((a,b) -> a-b);
		Integer maxNumber = optionalMaxNumber.get();
		System.out.println("maxNumber : "+maxNumber);
		
		// forEachOrdered
		// Always processes elements in the encounter order (the original order of the stream).
		animals.stream().forEachOrdered(x -> System.out.println("forEachOrdered : "+x));
		
		
	}
	
}
