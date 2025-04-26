package vivekJava8.functionalInterface.lambdaUsecase2;

//refer Youtube Engineering Digest playlist Java8 10/21
// here we are using lambda expressions for Comparator Interface which is a Functional Interface
// here we are sorting List of Integer Type

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<>();
		marks.add(15);
		marks.add(35);
		marks.add(28);
		marks.add(57);
		marks.add(33);
		marks.add(99);
		
//		Collections.sort(marks);                                                     // sorted in ascending order
//		Collections.sort(marks, new SortMarks());                              // sorted in descending order        
	    
// ==================================================================			
		
		// we can also write above line in this way
					
//		Comparator<Integer> sortMarks = new SortMarks();
//		Collections.sort(marks, sortMarks);                                                      // sorted in descending order  
		
// ==================================================================	
		
		// we can also write above code by using Lambda Expressions with Functional Interface
		
		Comparator<Integer> sortMarks = (a,b) -> {
			
			if(a == b){
				return 0;
			}else if (a > b){
				return -1;
			}else{
				return 1;
			}
			
		};
		
		Collections.sort(marks, sortMarks);                              // sorted in descending order 
		
		System.out.println(marks);
		
		
	}
	
}
