package vivekJava8.stream.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//A type of stream that enables parallel processing of elements
// Allowing multiple threads to process parts of the stream simultaneously
// This can significantly improve performance for large data sets
// workload is distributed across multiple threads

public class ParallelTest {

	public static void main(String[] args) {
		
		// here using Sequential Stream
		long startTime = System.currentTimeMillis();
		List<Integer> numbList = Stream.iterate(1, x -> x+1).limit(20000).collect(Collectors.toList());
		List<Long> factList = numbList.stream().map(ParallelTest :: factorial).collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken to complete the process in sequential stream :  "+(endTime-startTime)+" ms");
		
		// here using Parallel Stream
		long startTime1 = System.currentTimeMillis();
		List<Integer> numbList1 = Stream.iterate(1, x -> x+1).limit(20000).collect(Collectors.toList());
		List<Long> factList1 = numbList.parallelStream().map(ParallelTest :: factorial).collect(Collectors.toList());
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken to complete the process in parallel stream  :  "+(endTime1 - startTime1)+" ms");
		
		
	}
	
	private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
	
}
