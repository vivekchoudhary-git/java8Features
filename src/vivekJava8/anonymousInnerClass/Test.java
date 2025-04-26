package vivekJava8.anonymousInnerClass;

// refer Youtube Engineering Digest playlist Java8  11/21
// here we can not use lambda expression with Functional Interface because Employee Interface has 2 Abstract Methods.

public class Test {

	public static void main(String[] args) {
		
// this is the traditional way of calling overriden methods of Interface or Parent Class		
		Employee doc = new Doctor();
		int esal = doc.getEmpSalary();
		String edesig = doc.getEmpDesignation();
		
		System.out.println("emp desig : "+edesig+"  emp salary :  "+esal);
	
	// we can aslo write above code using Anonymous Inner Class
	
	Employee doctor = new Employee(){                              // here doctor has object of Anonymous Class
		
		@Override
		public int getEmpSalary() {
			
			return 70000;
		}

		@Override
		public String getEmpDesignation() {
			
			return "doctor";
		}
		
	};
	
	Employee nurse = new Employee(){                            // here nurse has object of Anonymous Class
		
		@Override
		public int getEmpSalary() {
			
			return 25000;
		}

		@Override
		public String getEmpDesignation() {
			
			return "nurse";
		}
		
	};
	
	String docc = doctor.getEmpDesignation();
	int esall = doctor.getEmpSalary();
	
	System.out.println("anonymous employee  :  "+docc+"  salary  :  "+esall );
	
	String nur = nurse.getEmpDesignation();
	int nursal = nurse.getEmpSalary();
	
	System.out.println("anonymous employee  :  "+nur+"  salary  :  "+nursal );

	}
	
}
