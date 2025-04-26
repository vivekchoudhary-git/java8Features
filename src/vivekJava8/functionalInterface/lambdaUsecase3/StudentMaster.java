package vivekJava8.functionalInterface.lambdaUsecase3;

import java.util.ArrayList;
import java.util.List;

public class StudentMaster {

	public List<Student> getStudentsList(){
		
		List<Student> studList = new ArrayList<>();
		
	   Student stud = new Student();
	   stud.setId(1);
	   stud.setName("rahul dravid");
	   
	   Student stud1 = new Student();
	   stud1.setId(12);
	   stud1.setName("sachin tendulkar");
	   
	   Student stud2 = new Student();
	   stud2.setId(7);
	   stud2.setName("m s dhoni");
	   
	   Student stud3 = new Student();
	   stud3.setId(18);
	   stud3.setName("virat kohli");
	   
	   studList.add(stud);
	   studList.add(stud1);
	   studList.add(stud2);
	   studList.add(stud3);
		
	   return studList;
	}
	
}
