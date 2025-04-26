package vivekJava8.DifferenceBtwLambdaAndAnonymous;

//refer Youtube Engineering Digest playlist Java8  11/21
// Difference between lambda expression and anonymous inner class

public class Test {

	int a = 30;                                                 // Here a is class (instance) variable
	
	public void doSomething(){
		
		int b = 50;                                                  // Here a is local variable
	// Here overriding Employee method by using Lambda Expression
		
		Employee doctor = () -> {
			
		int  c = 40;                                        // Here c is local variable
			return "doctor";
		};
		
		
		// Here overriding Employee method by using Anonymous Inner Class
		
		Employee nurse = new Employee(){

			int d = 99;                                                    // Here d is class (instance) variable
			@Override
			public String designation() {
				
				System.out.println(this.d);
				return "nurse";
			}
			
		};
		
	}
	
}
