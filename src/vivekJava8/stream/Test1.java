package vivekJava8.stream;

//refer Youtube Engineering Digest playlist Java8 19/21
//Basic Concepts Part-2

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,19,4,74,32,56,28,94,43,67,1,4,94);
		
		// here we have applied condition that the integer must be even and then we have added even integers to new List
		List<Integer> evenIntegers = integers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		evenIntegers.forEach(x -> System.out.println("even numbers : "+x));
		
		//here we have divided numbers of evenIntegers list  by 2 and then we have added these numbers to new List
		List<Integer> mappedList = evenIntegers.stream().map(n -> n/2).collect(Collectors.toList());
		mappedList.forEach(n -> System.out.println("mappedList : "+n));
		
		// how to remove duplicate numbers
		List<Integer> distinctList = integers.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctList : "+distinctList);
		
		// how to sort numbers in ascending orders
		List<Integer> sortedList = integers.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedList : "+sortedList);
		
		// how to sort numbers in descending orders
		List<Integer> sortedList1 = integers.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		System.out.println("sortedList1 : "+sortedList1);
		
		// show only 3 numbers(elements) of the integers list
		List<Integer> limitList = integers.stream().limit(3).collect(Collectors.toList());
		System.out.println("limitList : "+limitList);
		
		// skip first 2 elements from list
		List<Integer> skipList = integers.stream().skip(2).collect(Collectors.toList());
		System.out.println("skipList : "+skipList);
		
		
	}
	
}
