package vivekJava8.functionalInterface.lambdaUsecase1;

public class My implements Runnable {

	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++){
			
			System.out.println("Hello :  "+i);
		}
		
	}

}
