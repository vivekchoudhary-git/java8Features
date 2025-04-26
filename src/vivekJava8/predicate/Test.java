package vivekJava8.predicate;

// refer Youtube Engineering Digest playlist Java8  12/21

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
	Predicate<Integer> checkConditon = x -> x > 100;
	boolean result = checkConditon.test(50);
	System.out.println("predicate result is  :  "+result);
	
// ==============================================
	// use Predicate default method and()
	
	Predicate<String> startsWithS = (x) -> x.charAt(0) == 's';
	boolean res1 = startsWithS.test("rachin");
	System.out.println(" and res1 : "+res1);
	
	Predicate<String> endsWithN = (x) -> x.charAt(x.length()-1) == 'n';
	boolean res2 = endsWithN.test("sachin");
	System.out.println("and res2 : "+res2);
	
	Predicate<String> startsWithSandendsWithN = startsWithS.and(endsWithN);
	
	boolean res3 = startsWithSandendsWithN.test("vachin");                                             // .and() combines two predicates by returning a new one with test() implemented.
	System.out.println("and res3 : "+res3);                                                           // in simple language startsWithSandendsWithN.test("vachin");   this test method has been overriden inside and method 
		
	// ==============================================
		// use Predicate default method or()
		
		Predicate<String> startsWithV = (x) -> x.charAt(0) == 'v';
		boolean ress1 = startsWithV.test("virat");
		System.out.println("or ress1 : "+ress1);
		
		Predicate<String> endsWithT = (x) -> x.charAt(x.length()-1) == 't';
		boolean ress2 = endsWithT.test("sachin");
		System.out.println("or ress2 : "+ress2);
		
		Predicate<String> startsWithVandendsWithT = startsWithV.or(endsWithT);
		
		boolean ress3 = startsWithVandendsWithT.test("vachin");                                           
		System.out.println("or ress3 : "+ress3);   
	
// ================================================================
		// use Predicate default method negate()
		
		Predicate<String> startsWithZ = x -> x.charAt(0) == 'z';
		boolean rst = startsWithZ.test("zomato");
		System.out.println(" befor negation rst "+rst);
		
		Predicate<String> negatestartsWithZ = startsWithZ.negate();
		boolean rstn = negatestartsWithZ.test("zomato");
		System.out.println(" after negation rst "+rstn);
		
// ================================================================
		// use Predicate static method isEqual()
		
		Predicate<Object> pred = Predicate.isEqual("cricket");
		boolean re = pred.test("cricket");                                                 // here test method is overriden in isEqual() method
		System.out.println("isEqual result  : "+re);
		
		
	}
	
}

