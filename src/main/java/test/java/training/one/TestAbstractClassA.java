package test.java.training.one;

public abstract class TestAbstractClassA implements TestInterface1{
	
	public static final int myInteger=42;
	public int myInteger2;
	
	public void testMethodOne(){
		System.out.println("This is first concrete/normal method");
	}
	
	public TestAbstractClassA(int myNum){
		System.out.println("this is a parameterized constructor");
	}
	
	static{
		
		
		System.out.println("this is a static block");
	}
	
	public abstract void testMethodTwo();

	public abstract void testMethodTwo(String name);
}
