package vivekJava8.functionalInterface.lambdaUsecase2;

import java.util.Comparator;

public class SortMarks implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		
		if(a == b){
			return 0;
		}else if (a > b){
			return -1;
		}else{
			return 1;
		}
		
	}

}
