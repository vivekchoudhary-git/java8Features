package vivekJava8.methodReference;

// refer Youtube Engineering Digest playlist Java8 18/21
// Method Reference concept.

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void print(String s){
		
		System.out.println("method reference : "+s);
	}
	
	public void print1(String s){
		
		System.out.println("method reference1 : "+s);
	}
	
	public static void main(String[] args) {
		
		List<String> players = Arrays.asList("sachin","dravid","kumble","zaheer","harbhajan");
		
		// traditional way before java 1.8
		for( String s : players){
			
			System.out.println(s);
		}
		
		// new way to iterate using  java 1.8
		players.forEach(s -> System.out.println("lambda : "+s));
		
		// we can do the same work without using lambda expression instead we can use method reference
		//Note: here print method is static
		players.forEach(Test :: print);
		
		// Note : when method is not static
		Test test = new Test();
		players.forEach(test :: print1);
		
	}
	
}
