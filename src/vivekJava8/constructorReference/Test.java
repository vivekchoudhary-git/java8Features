package vivekJava8.constructorReference;

//refer Youtube Engineering Digest playlist Java8 18/21
//Constructor Reference concept.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<String> playersList = Arrays.asList("sachin","dravid","kumble","zaheer","harbhajan");
		
		// here we are creating new Object of SportsMan by passing players name after extracting from playersList and then we are putting student objects in new List which is called sportsManList
		List<SportsMan> sportsManList = playersList.stream().map(x -> new SportsMan(x)).collect(Collectors.toList());
		
		// we can also write above code using Constructor Reference Concept
		List<SportsMan> sportsManList1 = playersList.stream().map(SportsMan :: new).collect(Collectors.toList());
		
		// iterating in traditinal way as before Java 1.8
		for(SportsMan sm : sportsManList){
			
			System.out.println(sm.getName());
		}
		
		// iterating in new way after Java 1.8
		sportsManList.forEach(x -> System.out.println("lambda : "+x.getName()));
		
		// iterating in new way after Java 1.8 (constructor reference)
		sportsManList1.forEach(x -> System.out.println("constructor reference  :  "+x.getName()));
		
	}
	
}
