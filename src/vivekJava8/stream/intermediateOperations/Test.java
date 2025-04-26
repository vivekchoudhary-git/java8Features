package vivekJava8.stream.intermediateOperations;

// refer Youtube video Engineering Digest playlist Java Collections Framework 19/22
//intermediate operations of Stream are filter,map,sorted,distinct,limit,skip,peek,flatmap etc.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		// Filter
		List<Integer> numbers = Arrays.asList(1,8,5,11,3,22,20,17);
		List<Integer> filteredNumbers = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		filteredNumbers.forEach(x -> System.out.println("filteredNumbers : "+x));
		
		//map
		List<Integer> mappedNumbers = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		mappedNumbers.stream().forEach(x -> System.out.println("mappedNumbers : "+x));
		
		// sorted
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedNumbers : "+sortedNumbers);
		
		// distinct
		List<Integer> duplicate = Arrays.asList(1,1,2,2,2,3,4,4,4,4,5,5);
		List<Integer> distinctList = duplicate.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct List : "+distinctList);
		
		// limit
		List<Integer> limitNumbers = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println("limitNumbers : "+limitNumbers);
		
		// skip
		List<Integer> skipNumbers = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("skipNumbers : "+skipNumbers);
		
		// peek 
		long count = numbers.stream().limit(4).peek(x -> System.out.println("peek : "+x)).count();
		System.out.println("count : "+count);
		
		// flatmap
		
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("dravid","sachin","ganguly"),Arrays.asList("messi","pele","ronaldo"),Arrays.asList("bolt","tiger woods","phelps"));
		System.out.println(listOfLists.get(0).get(0));
		
		// example-1  it will become single list
		List<String> flatMapList = listOfLists.stream().flatMap(li -> li.stream().map(str ->str.toUpperCase())).collect(Collectors.toList());
		System.out.println("flatMapList : "+flatMapList);
		
		// example -2
		List<String> sentences = Arrays.asList("study Streams","in Java 8","it is very useful");
		List<String> flatMapSentence = sentences.stream().flatMap(str -> Arrays.stream(str.split(" "))).map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println("flatMapSentence : "+flatMapSentence);
		
		
	}
	
}
