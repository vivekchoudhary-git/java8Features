package vivekJava8.functionalInterface.lambdaUsecase1;

//refer Youtube Engineering Digest playlist Java8 9/21
// here we are using lambda Expression with Functional Interface Runnable

public class Test {

	public static void main(String[] args) {
		
		// traditional way without using lambda Expression with Functional Interface
		My my = new My();
		
		Thread thread = new Thread(my);
		         thread.run();
		
// using Lambda expression with Functional Interface		      
		         
		  Runnable runnable = () ->{
			  
			  for(int i=0 ; i<10 ; i++){
					
					System.out.println("Lambda Hello :  "+i);
				}
			  
		  };
		         
		         runnable.run();
	}
	
}
