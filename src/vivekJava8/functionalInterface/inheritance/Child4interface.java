package vivekJava8.functionalInterface.inheritance;

//this interface is also a functional interface because it has only one abstract method.

@FunctionalInterface
public interface Child4interface extends ParentInterface {

      default void print(){                                                     // this is default method
		
		System.out.println("hello world");
	}
	
	  public static void musicOn(){                                           // this is static method
		
		System.out.println("play the song...........");
	}
	
}
