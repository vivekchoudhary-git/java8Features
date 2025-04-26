package vivekJava8.functionalInterface.lambdaUsecase3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		StudentMaster sm = new StudentMaster();
		List<Student> studList = sm.getStudentsList();
		
//		Collections.sort(studList, new StudentId());                   // sorting by Student Id in descending order
		
//		Collections.sort(studList, new StudentName());           // sorting by Student Name in descending order
		
// ===============================================================================		
		
// we can also write above line of code 	in this way	
		
//		Comparator<Student> studentId = new StudentId();
//		Collections.sort(studList, studentId);                                                  // sorting by Student Id in descending order
		
//		Comparator<Student> studentName = new StudentName();
//		Collections.sort(studList, studentName);                                                      // sorting by Student Name in descending order
		
// ==================================================================================	
		
// Now we are using Lambda Expressions with Functional Interface Comparator
		
		Comparator<Student> studentId = (s1,s2) -> {
			
			if(s1.getId() == s2.getId()){
				return 0;
			}else if(s1.getId() > s2.getId()){
				return -1;
			}else
			
			return 1;
			
		};
		
		Comparator<Student> studentName = (s1,s2) -> {
			
			return	s2.getName().compareTo(s1.getName());
		};
		
		
//		Collections.sort(studList, studentId);                                                  // sorting by Student Id in descending order
		Collections.sort(studList, studentName);                                                      // sorting by Student Name in descending order
		
		System.out.println(studList);
		
	}
	
}
