package vivekJava8.functionalInterface.staticMethod;

public class Test {

	public static void main(String[] args) {
		
		B b = new B();
		b.sayHello();
		B.sayHello();              // calling method directly by Class
		
		Ainterface.sayHello();
		
	}
	
}
