package vivekJava8.functionalInterface.inheritance;

// this interface is not a Functional Interface as it has 2 abstract methods
// Note : one abstract method is of parent interface and second abstract method is in child interface

//   @FunctionalInterface
public interface Child3interface extends ParentInterface {

	public void sayBye();
	
}
