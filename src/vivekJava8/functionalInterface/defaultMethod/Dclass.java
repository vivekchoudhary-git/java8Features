package vivekJava8.functionalInterface.defaultMethod;

public class Dclass implements Ainterface,Binterface{

	// option-1
//	@Override
//	public void sayHello() {
		
//		Ainterface.super.sayHello();                      // overriden Ainterface method
//	}
	
	// option-2
//	@Override
//	public void sayHello() {
		
//		Binterface.super.sayHello();                          // overriden Binterface method
//	}

	// option-3
	public void sayHello(){
		
		System.out.println("Dclass says hello.........");
		
	}
	
}
