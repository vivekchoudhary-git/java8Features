package vivekJava8.functionalInterface.inheritance;

// this interface is also a Functional interface because it has only one abstract method
// Note : parent and child both interface has same abstract method

@FunctionalInterface
public interface Child2interface extends ParentInterface{

	public void sayHello();
	
}
