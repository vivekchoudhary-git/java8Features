package vivekJava8.functionalInterface.basic1;

// refer Youtube Engineering Digest playlist- java8  4/21

@FunctionalInterface                                                   // this annotation is optional but recommended
public interface MyInterface {

	public void sum(int a, int b);                     // this is abstract method
	
	default void print(){                                                     // this is default method
		
		System.out.println("hello world");
	}
	
	public static void musicOn(){                                           // this is static method
		
		System.out.println("play the song...........");
	}
	
}


// Functional interface is an interface which must have only one abstract method,it can have many default and static methods.
// Interface can have many default and static methods from java 1.8.