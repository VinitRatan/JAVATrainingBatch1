package test.java.training.one;

public  class ChildOne extends TestAbstractClassA{

	public ChildOne(){
		super(23);
		System.out.println("Child class constructor");
	}

	@Override
	public void testMethodTwo() {
		// TODO Auto-generated method stub
		System.out.println("testMethodTwo");
	}

	@Override
	public void testMethodTwo(String name) {
		// TODO Auto-generated method stub
		System.out.println("testMethodTwo with string "+name);
	}
	
	
	public static void main(String[] args){
		TestAbstractClassA abstractObj=new ChildOne();
		ChildOne concreteObj=new ChildOne();
		concreteObj.testMethodTwo("testName");
		concreteObj.testMethodTwo();
		concreteObj.testMethodOne();
	}

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testMethod2(String methodParam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testMethod3() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
