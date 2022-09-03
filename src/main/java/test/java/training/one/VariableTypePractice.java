package test.java.training.one;

public class VariableTypePractice {
	
	int instanceVar=98;
	static int staticVar=5;
	

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		VariableTypePractice object=new VariableTypePractice();
		
		object.localVariableTest();
		object.localVariableTest2();
		//System.out.println("instanceVar: "+object.instanceVar);
		//System.out.println("Static var: "+staticVar);

	}
	
	
	public  void localVariableTest(){
		int a=1;
		
		System.out.println("local var:"+a+" instance var: "+instanceVar);
		 a++;
		 instanceVar++;
		
	}
	
	public  void localVariableTest2(){
		int b=1;
		
		System.out.println("local var 2:"+b+" instance var called in method 2: "+instanceVar);
	
		
	}

}
