package test.java.training.one;

public class Employee {

	String empName;
	int empSal;
	static String empCEO;
	
	public static void testStatic(){
		
		System.out.println("I am an static method");
	}
	
	
	static{
		
		Employee.empCEO="Indira Nooyi";
	}
	
	public static class StaticClass{
		
		
	}
	
	
}

class StaticTest2{
	
	static String test2;
static{
		
		System.out.println("static block for class c");
	}
	
}


class StaticTest{
	
	public static int variableTestStatic;
	static String test2;
	public static void methodb(){
		System.out.println("static method b");
	}
	
   static{
		
		System.out.println("static block for class b");
	}
	
	public static void main(String[] args){
	StaticTest.test2=null;
	variableTestStatic=0;
	methodb();
	Employee emp1=new Employee();
	emp1.empName="Naveen";
	emp1.empSal=5000;
    //emp1.empCEO="Indira Nooyi";
    
    
    System.out.println(emp1.empName+" "+emp1.empSal+" "+emp1.empCEO);
	
	
	Employee emp2=new Employee();
	emp2.empName="Bhoomika";
	emp2.empSal=6000;
	//emp2.empCEO="Indira Nooyi";
	System.out.println(emp2.empName+" "+emp2.empSal+" "+emp2.empCEO);
	Employee.testStatic();
	
	}
}
