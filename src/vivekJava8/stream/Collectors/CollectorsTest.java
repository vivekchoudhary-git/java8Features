package vivekJava8.stream.Collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTest {

	public static void main(String[] args) {
		
		// collecting to List
		List<String> animalsList = Arrays.asList("elephant","monkey","cow","wolf","lion","owl","cat");
		List<String> animalsFilteredList = animalsList.stream().filter(str -> str.startsWith("c")).collect(Collectors.toList());
		System.out.println("animalsFilteredList : "+animalsFilteredList);
		
		// collecting to Set
       List<Integer> numbersList = Arrays.asList(1,1,2,2,2,3,3,4,4,4,4,5,5,6,6,7);
       Set<Integer> numbersSet = numbersList.stream().collect(Collectors.toSet());
       System.out.println("numbersSet : "+numbersSet);
		
       //  Joining Strings
       // Concatenates stream elements into a single String
       String joiningAnimals = animalsList.stream().map(str -> str.toUpperCase()).collect(Collectors.joining(","));
       System.out.println("joiningAnimals : "+joiningAnimals);
       
       //  Summarizing Data
       // Generates statistical summary (count, sum, min, average, max)
       IntSummaryStatistics summarizing = numbersList.stream().collect(Collectors.summarizingInt(x -> x));
       long count = summarizing.getCount();
       long sum = summarizing.getSum();
       double average = summarizing.getAverage();
       int max = summarizing.getMax();
       int min = summarizing.getMin();
       System.out.println("summarizing :-  count : "+count+", sum : "+sum+", average : "+average+", max : "+max+", min : "+min);
       
       // averagingInt - to calculate average
       Double average1 = numbersList.stream().collect(Collectors.averagingInt(x -> x));
       System.out.println("averagingInt : "+average1);
       
       // summingInt - to calculate sum
       Integer sum1 = numbersList.stream().collect(Collectors.summingInt(x -> x));
       System.out.println("summingInt : "+sum1);
       
       // groupingBy - to group elements
       Map<Integer, List<String>> groupingBy = animalsList.stream().collect(Collectors.groupingBy(str -> str.length()));
       System.out.println("groupingBy : "+groupingBy);
       
       Map<Integer, String> groupingBy1 = animalsList.stream().collect(Collectors.groupingBy(str -> str.length(),Collectors.joining(",")));
       System.out.println("groupingBy1 : "+groupingBy1);
       
         Map<Integer, Long> groupingBy2 = animalsList.stream().collect(Collectors.groupingBy(str -> str.length(),Collectors.counting()));
       System.out.println("groupingBy2 : "+groupingBy2);
       
       // partitioningBy
       Map<Boolean, List<String>> partitioningBy = animalsList.stream().collect(Collectors.partitioningBy(str -> str.length() > 3));
       System.out.println("partitioningBy : "+partitioningBy);
       
       Map<Boolean, String> partitioningBy1 = animalsList.stream().collect(Collectors.partitioningBy(str -> str.length() > 3, Collectors.joining(",")));
       System.out.println("partitioningBy1 : "+partitioningBy1);
       
       // Mapping and Collecting
       // Applies a mapping function before collecting
       List<String> mappedList = animalsList.stream().collect(Collectors.mapping(str -> str.toUpperCase(), Collectors.toList()));
       System.out.println("mappedList : "+mappedList);
         
       // toMap - Creating a Map from Stream Elements
       
       List<String> sportsItemList = Arrays.asList("bat","racket","ball","golf stick","helmet","pad");
       Map<String, Integer> sportsItemMap = sportsItemList.stream().collect(Collectors.toMap(str -> str.toUpperCase(),str -> str.length()));
       System.out.println("sportsItemMap : "+sportsItemMap);
       
      
	}
	
}
