package vivekJava8.function;

// refer Youtube Engineering Digest playlist Java8 13/21
// Java 8 Function Interface Explained: How to Use apply()

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		//example 1
		Function<String, Integer> function1 = s -> s.length();
		Integer res1 = function1.apply("dhoni");
		System.out.println("function1 result  :  "+res1);
		
		//example 2
	   Function<String, String> function2 = s -> s.substring(0, 3);
	   String res2 = function2.apply("virat");
	   System.out.println("function2 result  :  "+res2);
	   
	   // //example 3
	   List<Student> studList = new ArrayList<>();
	   
	    Student s1 = new Student();
	    s1.setId(1);
	    s1.setName("veersingh");
	    
	    Student s2 = new Student();
	    s2.setId(4);
	    s2.setName("dharam");
	    
	    Student s3 = new Student();
	    s3.setId(21);
	    s3.setName("veerbhadra");
	    
	    Student s4 = new Student();
	    s4.setId(33);
	    s4.setName("bumrah");
	    
	    studList.add(s1);
	    studList.add(s2);
	    studList.add(s3);
	    studList.add(s4);
	    
	    Function<List<Student>, List<Student>>  function3 = l -> {
	    	
	    	List<Student> studListt = new ArrayList<>();
	    	
	    	for(Student s : l){
	    		
	    		System.out.println(s.getName().substring(0, 4));
	    		if(s.getName().substring(0, 4).equalsIgnoreCase("veer")){
	    			
	    			studListt.add(s);
	    		}
	    		
	    	}
	    	return studListt;
	    };
	   
	    List<Student> modifiedStudList = function3.apply(studList);
	    System.out.println("modified List  :  "+modifiedStudList);
	    
	}
	
}
