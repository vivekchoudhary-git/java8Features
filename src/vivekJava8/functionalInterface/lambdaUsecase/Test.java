package vivekJava8.functionalInterface.lambdaUsecase;

// refer Youtube Engineering Digest playlist Java8 8/21

public class Test {

	public static void main(String[] args) {
		
		// this is the traditional way of implementing interface and calling override methods
		
		Sports cric = new Cricket();
		
		String sp = cric.sportName();
		System.out.println(sp);
		
		
		Sports hck = new Hockey();
		
		String spp = hck.sportName();
		System.out.println(spp);
		
		
		// ========= Using Lambda Expression in Functional Interface =========
		
		Sports cric1 = () -> "cricket";
		String sp1 = cric1.sportName();
		System.out.println("Lambda Express.... "+sp1);
		
		Sports hck1 = () -> "hockey";
		String spp1 = hck1.sportName();
		System.out.println("Lambda Express.... "+spp1);
		
		
	}
	
}
