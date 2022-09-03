package test.java.training.one;

public class SampleDataType {
	
	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
	/*	int n1=10;
		int n2=8;
		
		int result=n1*n2;
		
		
		
		
		
		
	int result2=	MethodPractice.addition();
		
		System.out.println("addition value is: "+MethodPractice.addition()+ " passed");
	
	
		MethodPractice practice1=new MethodPractice();
		int product=practice1.multiplication(4, 3, 6);
		
		System.out.println("product is: "+product);*/
		
		VariableTypePractice object=new VariableTypePractice();
		
		System.out.println("instanceVar: "+object.instanceVar);
	
		System.out.println("Static var: "+VariableTypePractice.staticVar);
		VariableTypePractice classRef=null;
		
		System.out.println("Static var: "+classRef.staticVar);
	
	}
	
	
	public void method1(){
VariableTypePractice object=new VariableTypePractice();
		
		System.out.println("instanceVar: "+object.instanceVar);
	}

}
