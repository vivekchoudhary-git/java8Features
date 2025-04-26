package vivekJava8.biPredicate;

// refer Youtube Engineering Digest playlist Java8 16/21

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		// using Bipredicate Interface abstract method test()
		BiPredicate<Integer, Integer> biPredicate1 = (x,y) -> x%2==0 && y%2==0;                               // checking whether x and y are even or not
		boolean res1 = biPredicate1.test(8, 10);
		System.out.println("res1 : "+res1);
		
		
		BiPredicate<String, Integer> biPredicate2 = (str,x) -> str.length() == x;
		boolean res2 = biPredicate2.test("bharat", 6);
		System.out.println("res2 : "+res2);
		
		BiPredicate<Integer, Integer> biPredicate3 = (x,y) -> x == y;
		boolean res3 = biPredicate3.test(6, 6);
		System.out.println("res3 : "+res3);
		
		// using Bipredicate Interface default method and()
		BiPredicate<Integer, Integer> andBipredicate = biPredicate1.and(biPredicate3);
		boolean andRes = andBipredicate.test(10, 10);
		System.out.println("andRes : "+andRes);
		
		// using Bipredicate Interface default method or()
		BiPredicate<Integer, Integer> orBipredicate = biPredicate1.or(biPredicate3);
		boolean orRes = orBipredicate.test(22, 20);
		System.out.println("orRes : "+orRes);
		
		// using Bipredicate Interface default method negate()
		BiPredicate<Integer, Integer> negateBipredicate = biPredicate1.negate();
		boolean negateRes = negateBipredicate.test(4, 8);
		System.out.println("negateRes : "+negateRes);
		
	}
	
}
